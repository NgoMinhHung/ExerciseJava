public class Array20 {

    public int[][] getSubArray(int[][] arr, int startRow,int startCol, int rowCount, int colCount){

        int[][] result = new int[rowCount][colCount];

        if (startRow + colCount <= arr[0].length  && startCol + rowCount <= arr.length ){
            for(int i=0;i<rowCount; i++)
                for(int j=0; j< colCount; j++)
                    result[i][j] = arr[i+startRow][j+ startCol];
        }else {
            return null;
        }
        return result;
    }
}
