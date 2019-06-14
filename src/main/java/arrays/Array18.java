package arrays;

import java.util.Arrays;

public class Array18 {

    public int[] convertMatrixOneDimentionalArray(int n, int m, int[][] arr){

        int[] result = new int[n*m];
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j ++){
                result[count] = arr[i][j];
                count++;
            }
        }
        return result;
    }
    public int[][] sortMatrix(int n, int m, int[][] arr){

        int[] oneDementionalArray = convertMatrixOneDimentionalArray(n,m,arr);
        Arrays.sort(oneDementionalArray);
        int count = 0;
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = m - 1; j >= 0; j--){
                result[i][j] = oneDementionalArray[count];
                count ++;
            }
        }
        return result;
    }
}
