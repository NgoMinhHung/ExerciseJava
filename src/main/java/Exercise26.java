import java.util.ArrayList;

public class Exercise26 {

    public int fineNumberCrazyFibonacci(int n, ArrayList<Integer> arrayList){

        int result = 0;

        if (n < 1) return -1;
        if (n <= 5) return arrayList.get(n-1);
        else {
                for (int i = 5; i < n; i++) {
                    result = (arrayList.get(i - 5) + arrayList.get(i - 4) + arrayList.get(i - 3) + arrayList.get(i - 2) + arrayList.get(i - 1)) % 10;
                    arrayList.add(result);
                }
            }

        return result;
    }
}
