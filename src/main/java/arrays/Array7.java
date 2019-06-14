package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Array7 {

    public ArrayList<Integer> getLongestArrayOfChildren(int[] arr) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int arrayChunkSize = 0; // luu do dai mang con lien tiep
        int firstPosition = 0;  // luu vi tri dau cua mang con lien tiep
        int currentLength = 0; //luu do dai mang con hien tai


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                if (arrayChunkSize < currentLength) {
                    arrayChunkSize = currentLength;
                    firstPosition = i - arrayChunkSize;
                }
                currentLength = 0;
            }
        }

        if (arrayChunkSize < currentLength) {
            arrayChunkSize = currentLength;
            firstPosition = arr.length - arrayChunkSize;
        }

        for (int i = firstPosition - 1; i < arrayChunkSize + firstPosition; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
