package arrays;

public class Array11 {

    public int[] getSubArray(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 != 0) {
                if (arr[right] % 2 != 0) {
                    arr[left] += arr[right] - (arr[right] = arr[left]);
                    left++;
                    right--;
                } else {
                    right--;
                }
            }else {
                left++;
            }
        }
        left = 0;
        right = arr.length - 1;
        while (left < right){
            if (arr[left] % 2 == 0) {
                if (arr[right] % 2 == 0) {
                    arr[left] += arr[right] - (arr[right] = arr[left]);
                    left++;
                    right--;
                } else {
                    right--;
                }
            }else {
                left++;
            }
        }
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
}
