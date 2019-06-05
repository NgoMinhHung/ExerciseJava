import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array4 {

    public ArrayList<Integer> sortArray(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arrayList.add(arr[i]);
            }
        }
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] % 2 == 1){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
}
