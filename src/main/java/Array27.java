import java.util.ArrayList;
import java.util.Arrays;

public class Array27 {

    public ArrayList<Integer> getNumbersMaximunOfArray(int k, int[] arr){

        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = arr.length - k; i < arr.length; i++){
            result.add(arr[i]);
        }
        return result;
    }
}
