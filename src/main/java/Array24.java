public class Array24 {
    public  int getGreatestCommonDivisor(int x, int y){
        if(x*y == 0) return x+y;
        while(x != y){
            if(x > y) x = x - y;
            else y = y - x; }
        return x;
    }
    public int getLeastCommonMultiple(int x, int y){
        return (x * y / getGreatestCommonDivisor(x,y));
    }
    public int getLeastCommonMultiple(int[] arr){

        int result = getLeastCommonMultiple(arr[0],arr[1]);
        for (int i = 0; i < arr.length; i++){
            result = getLeastCommonMultiple(result,arr[i]);
        }
        return result;
    }
}
