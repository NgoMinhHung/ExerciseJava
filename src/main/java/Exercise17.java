public class Exercise17 {
    public boolean check(long n){
        long number = 0;
        long tmp1 = n;
        long tmp2 = n;
        int m = 0;
        //find m
        while(tmp1 != 0){
            tmp1/=10;
            m++;
        }
        //count number = a^m + b^m +....
        while(tmp2!=0){
            long mod = tmp2%10;
            number += Math.pow(mod,m);
            tmp2 /= 10;
        }
        if (number == n) return true;
        else return false;
    }
    public String findInteger(long n){
        String result = "";
        for(int i= 10; i < n; i++){
            if(check(i)) result += i + " ";
        }
        return result;
    }
}
