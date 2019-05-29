package basics;

public class Exercise13 {
    public long calculateFactorial(int n) {
        return (n < 2) ? 1 : n * calculateFactorial(n - 1);
    }
    public float calculateExpresstion(int n) {
        float result = 0;
        for (int i = 0; i <= n; i++) {
            result += (float) 1 / calculateFactorial(i);
        }
        return result;
    }
    public float calulate(){
        int n = 0;
        while (Math.abs(calculateExpresstion(n+1) - calculateExpresstion(n)) > 0.00001){
            n++;
        }
        return calculateExpresstion(n);
    }
}
