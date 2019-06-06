public class Array13 {

    public int[][] rotateTowDimensionalArray(int n, int m, int[][] arr){
        int[][] resultArray = new int[m][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                resultArray[j][n-i-1] = arr[i][j];
            }
        }
        return resultArray;
    }
}
