package basics;

public class Exercise1 {
    public  int calculateGreatestCommonDivisor(int x, int y){
        if(x == 0 && y != 0) return y;
        else
        if(x != 0 && y == 0) return x;
        else
        while(x != y){
            if(x > y) x = x - y;
            else y = y - x;
        }
        return x;
    }
    public int calculateLeastCommonMultiple(int x, int y){
        if(calculateGreatestCommonDivisor(x,y) == 0) return 0;
        else return (x * y / calculateGreatestCommonDivisor(x,y)); }
}