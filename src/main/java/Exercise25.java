import java.util.ArrayList;

public class Exercise25 {

    public static int checkFibonacci(int n, int m) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int previousValue = 1;
        int currentValue = 1;

        arrayList.add(previousValue);
        arrayList.add(currentValue);

        while (previousValue + currentValue <= n) {
            int tmp;
            arrayList.add(previousValue + currentValue);
            tmp = currentValue;
            currentValue = previousValue + currentValue;
            previousValue = tmp;
        }
        while(arrayList.get(0) < m){
            arrayList.remove(0);
        }

        return arrayList.size();
    }
}
