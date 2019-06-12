import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Array7 {

    public int getPositionElementMaximum(int[] arr) {

        int result = 0;
        int Max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
                result = i;
            }
        }
        return result;
    }

    public ArrayList<Integer> getLongestArrayOfChildren(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        int[] arrayOfChildren = new int[arr.length]; // Mang luu do dai mang con tu vi tri i
        int[] lastPosition = new int[arr.length];   // Mang luu vi tri cuoi cua mang con tuong ung vi tri i

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[j + 1] && arrayOfChildren[j + 1] < arrayOfChildren[j] + 1) {
                    arrayOfChildren[j] = arrayOfChildren[j] + 1;
                    lastPosition[i] = j;
                }
            }
        }
        int positionArrayLongest = getPositionElementMaximum(arrayOfChildren);
        for (int i = lastPosition[positionArrayLongest]; i <= arrayOfChildren[positionArrayLongest]; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
