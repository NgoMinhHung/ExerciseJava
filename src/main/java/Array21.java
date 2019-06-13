public class Array21 {

    public void getCofactor(int matrix[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = matrix[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public int calculateDeterminant(int n, int[][] matrix) {

        int result = 0; // Initialize result

        if (n == 1)
            return matrix[0][0];

        int temp[][] = new int[n][n];
        int sign = 1;

        for (int i = 0; i < n; i++) {
            getCofactor(matrix, temp, 0, i, n);
            result += sign * matrix[0][i] * calculateDeterminant(n - 1, temp);
            sign = -sign;
        }

        return result;
    }
}
