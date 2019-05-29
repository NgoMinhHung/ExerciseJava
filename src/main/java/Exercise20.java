public class Exercise20 {
    public long sumFirtsNumbersOfFibonacci(int n){
        long result = 2;
        long x1 = 1;
        long x2 = 1;
        for (int i = 2; i < n; i++){
            long tmp = x1 + x2;
            result += tmp;
            x1 = x2;
            x2 = tmp;
        }
        return result;
    }
}
