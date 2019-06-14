package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2 {

    public long sumThreeLargestNumbers(long[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3];
    }
}
