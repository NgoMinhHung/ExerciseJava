package arrays;

import java.util.Arrays;

public class Array9 {

    public int binarySearch(int[] arr, int x) {

        int l = 0;
        int r = arr.length;

        if (arr.length == 0) return -1;
        if (x < arr[l]) return -1;
        if (x > arr[r - 1]) return -1;

        while (r >= l) {
            int mid = (l + r) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}
