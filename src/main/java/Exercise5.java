import java.util.Scanner;

public class Exercise5 {
    public void printFibonaciNoAboveN(int n) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] A = new int[n];
        A[0] = 1;
        A[1] = 1;
        for (int i = 2; i < n; i++) {
            A[i] = A[i - 1] + A[i - 2];
        }
        for (int i = 0; i < n; i++) {
            if (A[i] <= n) System.out.print(A[i] + " ");
        }
    }
}
