public class Exercise12 {
    public  double calculateExpresstion(int n){
        double result = 1;
        double tmp = 1;
        for(int i = 1; i <= n; i++){
            tmp *= (double) 1/i;
            result += tmp;
        }
        return result;
    }
}
