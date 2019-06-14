package arrays;

public class Array3 {

    public long sumEvenMinusOddNumbers(long[] arr){

        long result = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                result += arr[i];
            } else {
                result -= arr[i];
            }
        }
        return result;
    }
}
