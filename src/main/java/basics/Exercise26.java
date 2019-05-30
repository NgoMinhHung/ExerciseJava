package basics;

import java.util.ArrayList;

public class Exercise26 {

    public int fineNumberCrazyFibonacci(int n, int[] arr){

        int result = 0;

        if (n < 1) return -1;
        if (n <= 5) return arr[n-1];
        else {
            for (int i = 6; i <= n; i++) {
                result = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]) % 10;
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = arr[3];
                arr[3] = arr[4];
                arr[4] = result;
            }

            return result;
        }
    }
}
