public class Exercise12 {
    public long calculateFactorial(int n){
        return (n < 2)? 1 : n * calculateFactorial(n-1);
    }
    public  float calculateExpresstion(int n){
        float result = 0;
        for(int i = 0; i <= n; i++){
            result += (float) 1/calculateFactorial(i);
        }
        return result;
    }
}
