public class Array22 {

    public int[][] deleteRowAndColumnOfMatrix(int n, int m, int[][] arr, int row, int column){
        int[][] result = new int[n-1][m-1];
        //delete row
        for (int i = row - 1; i < n - 1; i++ ){
            for (int j = 0; j < m; j++){
                arr[i][j] = arr[i+1][j];
            }
        }
        //delete column
        for (int i = 0; i < n; i++){
            for (int j = column - 1; j < m - 1; j++){
                arr[i][j] = arr[i][j+1];
            }
        }
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < m - 1; j++){
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }
}
