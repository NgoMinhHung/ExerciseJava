package basics;

public class Exercise1 {
    public  int calculateGreatestCommonDivisor(int x, int y){
        if(x == 0 && y != 0) return y;
        if(x != 0 && y == 0) return x;
        while(x != y){
            if(x > y) x = x - y;
            else y = y - x; }
        return x;
    }
    public int calculateLeastCommonMultiple(int x, int y){
        return (x * y / calculateGreatestCommonDivisor(x,y));
    }
}