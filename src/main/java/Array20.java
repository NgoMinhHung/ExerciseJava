public class Array20 {

    public int[][] getSubArray(int[][] arr, int startRow,int startCol, int rowCount, int colCount){

        int[][] result = new int[rowCount][colCount];
        int r = 0, c = 0;

        if (startRow + colCount <= arr[0].length  && startCol + rowCount <= arr.length ){
            for (int i = startCol; i < startCol + rowCount; i++){
                for (int j = startCol; j < startRow + colCount; j++){
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
