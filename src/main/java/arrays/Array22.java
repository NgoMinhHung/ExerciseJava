package arrays;

public class Array22 {

    public int[][] deleteRowAndColumnOfMatrix(int[][] arr, int row, int column){
        if (row > arr.length || column > arr[0].length) {
            return null;
        }

        int[][] result = new int[arr.length - 1][arr[0].length - 1];

        int rowCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int columnCount = 0;

            if (i == row - 1) {
                continue;
            }

            for (int k = 0; k < arr[0].length; k++) {

                if (k == column - 1) {
                    continue;
                }

                result[rowCount][columnCount] = arr[i][k];
                columnCount++;
            }

            rowCount++;
        }

        return result;
    }
}
