package arrays;

public class Array17 {

    public int[][] setSpiralArray(int n) {
        int[][] result = new int[n][n];
        int startRow = 0;
        int startColumn = 0;
        int row = n;
        int column = n;
        int value = 1;

        while ((startRow - row) + (startColumn - column) < 0) {

            for (int i = startColumn; i < column; i++) {
                result[startRow][i] = value;
                value++;
            }
            startRow++;


            for (int i = startRow; i < row; i++) {
                result[i][column - 1] = value;
                value++;
            }
            column--;

            if (startRow < row) {
                for (int i = column - 1; i >= startColumn; i--) {
                    result[row - 1][i] = value;
                    value++;
                }
                row--;
            }

            if (startColumn < column) {
                for (int i = row - 1; i >= startRow; i--) {
                    result[i][startColumn] = value;
                    value++;
                }
                startColumn++;
            }

        }
        return result;
    }
}
