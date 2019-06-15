package arrays;

import java.util.ArrayList;

public class Array10 {

    public int[][] devideEquallyElements(int n, int[] arr) {

        int lengthArr = arr.length;

        // tinh toan do dai moi mang con
        int chunkSize = lengthArr / n;
        chunkSize += lengthArr % n != 0 ? 1 : 0;

        int[][] result = new int[n][chunkSize];

        if (arr.length == 0) return null;
        if (n > arr.length) {
            return null;
        } else {
//            int countArr = 0;
            for(int i = 0; i < n; i++) {
                // sau do minh lay tu cac phan tu tu i -> i+chunkSize

                for (int j = 0; j < chunkSize && chunkSize * i + j < lengthArr; j++) {
//                    countArr++;
                    result[i][j] = arr[chunkSize * i + j];
                }
            }
        }
        return result;
    }
}
