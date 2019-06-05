public class Array8 {

    public long getMaximumDifferenceAndSmallestNumber(long[] arr) {
        long max = arr[0];
        long min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
