package arrays;

public class Array23 {
    public int greatestSum(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for (int number : arr) {
            if (number >= 0) {
                currentSum += number;
            } else {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                currentSum = 0;
            }
        }

        return (currentSum > maxSum) ? currentSum : maxSum;
    }
}