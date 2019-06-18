public class Array21 {

    public int[][] getCofactor(int matrix[][],  int row, int col) {

        int i = 0, j = 0;
        int n = matrix.length;
        int result[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r != row && c != col) {
                    result[i][j++] = matrix[r][c];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
        return result;
    }

    public int calculateDeterminant(int n, int[][] matrix) {

        int result = 0; // Initialize result

        if (n == 1)
            return matrix[0][0];

        int temp[][] = new int[n][n];
        int sign = 1;

        for (int i = 0; i < n; i++) {
            temp = getCofactor(matrix, 0, i);
            result += sign * matrix[0][i] * calculateDeterminant(n - 1, temp);
            sign = -sign;
        }

        return result;
    }
}
