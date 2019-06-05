import java.util.ArrayList;
import java.util.Arrays;

public class Array12 {

    public ArrayList<Integer> insertNumberIntoArrayAscending(int[] arr, int n) {

        int temp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                arrayList.add(arr[i]);
                temp ++;
            }

        }
        arrayList.add(n);
        for (int i = temp; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        return arrayList;
    }
}
