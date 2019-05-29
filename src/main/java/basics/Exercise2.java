package basics;

public class Exercise2 {
    public int calculateSumOfDigits(int x){
        int sum = 0;
        while(x != 0){
            sum = sum + (x % 10);
            x = x/10;
        }
        return sum;
    }
}
