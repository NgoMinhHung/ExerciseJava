public class Exercise4 {
    public String analysisOfPrimeNumberShort(int n){
        int count;
        StringBuilder s = new StringBuilder();
        for (int i =2; i <= n; i++){
            count = 0;
            while(n % i == 0){
                count++;
                n /= i;
            }
            if(count > 0) s.append(i);
            if(count > 1) s.append("^").append(count);
            if(n > i && count > 0) s.append(" * ");
        }
        return s.toString();
    }
}
