package basics;

public class Exercise1 {
    public  int calculateGreatestCommonDivisor(int x, int y){
        if(x*y == 0) return x+y;
        while(x != y){
            if(x > y) x = x - y;
            else y = y - x; }
        return x;
    }
    public int calculateLeastCommonMultiple(int x, int y){
        return (x * y / calculateGreatestCommonDivisor(x,y));
    }
}