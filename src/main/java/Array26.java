public class Array26 {

    public int reverse(int a) {

        int result = 0;

        while (a != 0) {
            result = 10 * result + a % 10;
            a /= 10;
        }
        return result;
    }

    public int sumNumberReverseOfArray(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += reverse(arr[i]);
        }
        return result;
    }
}
