package basics;

public class Exercise7 {
    public long sumNumberSequense(int n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i*(i+1);
        }
        return sum;
    }
}
