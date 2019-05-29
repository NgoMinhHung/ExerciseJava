public class Exercise24 {

    public int checkFibonacci(int n) {

        int result = 1;
        int previousValue = 1;
        int currentValue = 1;
        if (n < 1){
            return 0;
        }
            while (currentValue <= n) {
                result++;
                int tmp = previousValue + currentValue;
                previousValue = currentValue;
                currentValue = tmp;

            }

        return result;
    }
}
