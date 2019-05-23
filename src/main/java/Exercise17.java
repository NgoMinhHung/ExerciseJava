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
        int m = 0;
        //find m
        m = countNumber(n);
        //count number = a^m + b^m +....
        while(tmp!=0){
            long mod = tmp%10;
            number += Math.pow(mod,m);
            tmp /= 10;
        }
        if (number == n) return number == n;
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
