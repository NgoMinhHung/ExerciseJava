public class Exercise8 {
    public long calculateFactorial(int n){
        if(n < 2) return 1;
        else return (n * calculateFactorial(n-1));
    }
}
