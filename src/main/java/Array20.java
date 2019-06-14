public class Array20 {

    public int[][] getSubArray(int row, int column, int[][] arr, int x,int y, int b, int n){

        int[][] result = new int[b][n];
        int r = 0, c = 0;

        if (x + n <= column  && y + b <= row ){
            for (int i = y; i < y + b; i++){
                for (int j = y; j < x + n; j++){
                    result[r][c++] = arr[i][j];
                }
                c = 0;
                r++;
            }
        }else {
            return null;
        }
        return result;
    }
}
