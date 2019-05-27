public class Exercise20 {
    public long sumFibonacci(int n){
        long result = 2;
        long[] A = new long[n];
        A[0] = 1;
        A[1] = 1;
        for (int i = 2; i < n; i++){
            A[i] = A[i - 1] + A[i - 2];
            result += A[i];
        }
        return result;
    }
}
