package basics;

public class Exercise3 {
    public String analysisOfPrimeNumber(int n){
        int i;
        String s = new String();
        for(i = 2; i <= n; i++){
            while(n % i == 0){
                s = s + i;
                n /= i;
                if(n >= i) s += " * ";
            }
        }
        return s;
    }
}