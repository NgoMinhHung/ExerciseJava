public class Exercise24 {

    public int checkFibonacci(int n) {

        int result = 2;
        int previousValue = 1;
        int currentValue = 1;
        if (n < 1) return 0;
        else if (n == 1) return 2;
        else {
            int nextFibo = previousValue + currentValue;
            while (nextFibo <= n) {
                result++;
                previousValue = currentValue;
                currentValue = nextFibo;
                nextFibo = previousValue + currentValue;
            }
        }

        return result;
    }
}
