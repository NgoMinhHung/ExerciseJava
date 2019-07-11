import java.util.ArrayList;

public class Array14 {

    public ArrayList<Integer> convertTwoDimensionalArraytoOneDimensionalArray(int n, int m, int[][] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        int startingRow = 0;
        int startingColumn = 0;

        while(startingRow < n && startingColumn < m){
                // print first row
                for (int i = startingColumn; i < m; i++) {
                    result.add(arr[startingRow][i]);
                }
                startingRow++;


                //print last column
                for (int i = startingRow; i < n; i++) {
                    result.add(arr[i][m - 1]);
                }
                m--;

            //print last row
            if (startingRow < n){
                for (int i = m - 1; i >= startingColumn; i--){
                    result.add(arr[n-1][i]);
                }
                n--;
            }
            //print first column
            if (startingColumn < m){
                for (int i = n - 1; i >= startingRow; i--){
                    result.add(arr[i][startingColumn]);
                }
                startingColumn++;
            }
        }
        return result;
    }
}
