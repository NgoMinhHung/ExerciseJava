public class Exercise11 {
    public double calculateInterest(int n){
        double result = 100;
        int i = 0;
        while(i < n){
            result = result + result * (double) 1/n;
            i++;
        }
        return result;
    }
}
