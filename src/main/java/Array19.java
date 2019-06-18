import java.util.Arrays;

public class Array19 {

    public int[] convertMatrixOneDimentionalArray(int n, int m, int[][] matrix) {

        int[] result = new int[n * m];
        int count = 0;
        if (n * m != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[count] = matrix[i][j];
                    count++;
                }
            }

        }
        return result;
    }

    public int[][] sortSpiralMatrix(int n, int m, int[][] matrix) {


        int count = 0;
        int[][] result = new int[n][m];

        int startingRow = 0;
        int startingColumn = 0;
        int[] oneDimentionalArray = convertMatrixOneDimentionalArray(n, m, matrix);
        Arrays.sort(oneDimentionalArray);

        while (startingRow < n && startingColumn < m) {
            if (startingRow < n) {
                for (int i = startingColumn; i < m; i++) {
                    result[startingRow][i] = oneDimentionalArray[count];
                    count++;
                }
                startingRow++;
            }
            if (startingColumn < m) {
                for (int i = startingRow; i < n; i++) {
                    result[i][m - 1] = oneDimentionalArray[count];
                    count++;
                }
                m--;
            }
            if (startingRow < n) {
                for (int i = m - 1; i >= startingColumn; i--) {
                    result[n - 1][i] = oneDimentionalArray[count];
                    count++;
                }
                n--;
            }
            if (startingColumn < m) {
                for (int i = n - 1; i >= startingRow; i--) {
                    result[i][startingColumn] = oneDimentionalArray[count];
                    count++;
                }
                startingColumn++;
            }

        }
        return result;
    }

}
