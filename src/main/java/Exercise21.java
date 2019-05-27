public class Exercise21 {

    public int checkFibonacci(int n) {

        int result = 0;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        int i = 1;

        while (arr[i] <= n) {
            i++;
            arr[i] = arr[i - 1] + arr[i - 2];
            result = i;
        }

        return result;
    }
}
