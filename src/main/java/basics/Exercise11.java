package basics;

public class Exercise11 {
    public double calculateInterest(int n){
        double result = 100;
        for(int i =0; i < n; i++){
            result += result/n;
        }
        return result;
    }
}
