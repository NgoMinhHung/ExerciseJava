import java.util.ArrayList;

public class Exercise18 {
    public StringBuilder convertDecimalToBinary(int n){
        StringBuilder result = new StringBuilder();
        while (n != 0){
            result.append(n%2);
            n /= 2;
        }
        return result;
    }
    public Long convertBinaryToDecimal(int n){
        Long result = (long)0;
        StringBuilder binary = convertDecimalToBinary(n);
        binary.reverse();
        String s = binary.toString();
        String[] sInteger = s.split(" ");
        ArrayList<Integer> myIntegers = new ArrayList<Integer>();
        for(int i = 0; i < sInteger.length; i++){
            myIntegers.add(Integer.parseInt(sInteger[i]));
        }
        int j = 0;
        for(int i : myIntegers){
          result += i * (long) Math.pow(2,j);
          j++;
        }
        return result;
    }
}
