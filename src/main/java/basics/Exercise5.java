package basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public String fibonaci(int n) {
        String s = new String();
        int[] A = new int[n];
        A[0] = 1;
        A[1] = 1;
        s = s + A[0] + " " + A[1];
        for (int i = 2; i < n; i++) {
            A[i] = A[i - 1] + A[i - 2];
            if (n >= A[i]) s += " " + A[i];
        }
        return s;
    }
}
