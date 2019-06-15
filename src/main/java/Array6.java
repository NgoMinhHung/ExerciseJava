import java.util.Arrays;


public class Array6 {

    public static void swap(Integer[] arr, Integer pos1, Integer pos2){
        Integer temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    public Integer[] sortArray(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 0 && arr[i] > arr[j]) {
                        //arr[i] += (arr[j] - (arr[j] = arr[i]));
                        swap(arr, i,j);
                    }
                }
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 != 0 && arr[i] < arr[j]) {
                        //arr[i] += (arr[j] - (arr[j] = arr[i]));
                        swap(arr, i,j);
                    }
                }
            }
        }
        return arr;
    }
}
