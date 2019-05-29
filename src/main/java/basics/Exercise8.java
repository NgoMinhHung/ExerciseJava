package basics;

public class Exercise8 {
    public long calculateFactorial(int n) {
        return (n < 2)? 1 : n * calculateFactorial(n-1);}
}