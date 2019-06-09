import java.util.ArrayList;

public class Array10 {

    public ArrayList<ArrayList<Integer>> devideEquallyElements(int n, int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (arr.length == 0) return result;
        if (n > arr.length) {
            return result;
        } else {
            int lengthArr = arr.length;

            // tinh toan do dai moi mang con
            int chunkSize = lengthArr / n;
            chunkSize += lengthArr % n != 0 ? 1 : 0;

            for(int i = 0; i < lengthArr; i+=chunkSize) {
                // sau do minh lay tu cac phan tu tu i -> i+chunkSize
                ArrayList<Integer> splitList = new ArrayList<Integer>();
                for (int j = i; j < i + chunkSize && j < lengthArr; j++) {
                    splitList.add(arr[j]);
                }
                // push split list to result
                result.add(splitList);
            }
        }
        System.out.println(result);
        return result;
    }
}
