import java.util.ArrayList;

public class Exercise25 {

    public static int checkFibonacci(int n, int m) {

        int previousValue = 1;
        int currentValue = 1;
        int result = 0;

        while (previousValue <= n) {
            if(previousValue >= m){
                result ++;
            }
            int tmp = previousValue;
            previousValue = currentValue;
            currentValue = tmp + currentValue;
        }
        return result;
    }
}
