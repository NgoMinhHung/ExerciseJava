package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array1 {

    public List<Integer> getDuplicateElements(int[] arr) {
        ArrayList<Integer> resultArray = new ArrayList<>();

        int current = arr[0];

        int count = 1;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                if (count > 1) {
                    resultArray.add(current);
                    count = 1;
                }

                current = arr[i];
            }

            if (i == arr.length - 1 && count > 1) {
                resultArray.add(current);
            }
        }

        return resultArray;
    }
}
