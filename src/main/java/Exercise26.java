import java.util.ArrayList;

public class Exercise26 {

    public int fineNumberCrazyFibonacci(int n, ArrayList<Integer> arrayList){

        int result = 0;

        switch (n){
            case 0: {
                result = -1;
                break;
            }
            case 1: {
                result = arrayList.get(0);
                break;
            }
            case 2: {
                result = arrayList.get(1);
                break;
            }
            case 3: {
                result = arrayList.get(2);
                break;
            }
            case 4: {
                result = arrayList.get(3);
                break;
            }
            case 5: {
                result = arrayList.get(4);
                break;
            }
            default:{
                for (int i = 5; i < n; i++) {
                    result = (arrayList.get(i - 5) + arrayList.get(i - 4) + arrayList.get(i - 3) + arrayList.get(i - 2) + arrayList.get(i - 1)) % 10;
                    arrayList.add(result);
                }
            }
        }

        return result;
    }
}
