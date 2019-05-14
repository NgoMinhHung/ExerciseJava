package basics;

public class Exercise1 {
    public  int gcd(int x, int y){
        while(x != y){
            if(x > y) x = x - y;
            else y = y - x;
        }
        return x;
    }
    public int lcm(int x, int y){
        return (x * y / gcd(x,y));
    }
}
