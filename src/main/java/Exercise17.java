import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
    public int countNumber(long n){
        int result = 0;
        while(n != 0){
            n/=10;
            result++;
        }
        return result;
    }
    public boolean check(long n){
        long number = 0;
        long tmp = n;
        //find m
        int m = countNumber(n);
        //count number = a^m + b^m +....
        while(tmp!=0){
            long mod = tmp%10;
            number += Math.pow(mod,m);
            tmp /= 10;
        }

        return number == n;
    }
    public List<Integer> findInteger(long n){
        List<Integer> result = new ArrayList<Integer>();
        for(int i= 10; i < n; i++){

            if(check(i)) result.add(i);
        }
        return result;
    }
}
