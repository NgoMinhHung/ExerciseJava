public class Exercise2 {
    public int calculateSumOfDigitf(int x){
        int Sum = 0;
        while(x != 0){
            Sum = Sum + (x % 10);
            x = x/10;
        }
        return Sum;
    }
}
