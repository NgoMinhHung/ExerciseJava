public class Array25 {

    public  int getGreatestCommonDivisor(int x, int y){
        if(x*y == 0) return x+y;
        while(x != y){
            if(x > y) x = x - y;
            else y = y - x; }
        return x;
    }

    public int getGreatestCommonDivisorOfArray(int[] arr){

        int result = getGreatestCommonDivisor(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++){
            result = getGreatestCommonDivisor(result,arr[i]);
        }
        return result;
    }
}
