public class Exercise4 {
    public String analysisOfPrimeNumberShort(int n){
        int i, count;
        String s = new String();
        for (i =2; i <= n; i++){
            count = 0;
            while(n % i == 0){
                count++;
                n /= i;
            }
            if(count > 0) s += i;
            if(count > 1) s += "^" + count;
            if(n > i && count > 0) s += " * ";
            continue;
        }
        return s;
    }
}
