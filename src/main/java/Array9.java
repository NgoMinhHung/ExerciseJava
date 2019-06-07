import java.util.Arrays;

public class Array9 {

    public int binarySearch(int[] arr, int x) {
        int result = -1;
        int l = 0;
        int r = arr.length;

        if (x < arr[l]) return result;
        if (x > arr[r - 1]) return result;
        if (arr != null) {
            while (r >= l) {
                int mid = l + (r - l) / 2;

                if (arr[mid] == x) {
                    result = mid;
                }

                if (arr[mid] > x) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return result;
    }
}
