public class Exercise21 {
    public int checkFibonacci(int n){
        int result = 0;
        int A[] = new int[n];
        A[0] = 1;
        A[1] = 1;
        int i = 1;
        while (A[i] < n){
            i++;
            A[i] = A[i-1] + A[i - 2];
            result = i;
        }
        return result;
    }
}
