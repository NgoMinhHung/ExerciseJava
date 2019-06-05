public class Array5 {

    public boolean isPrime(long n) {

        boolean result = true;

        if (n < 2) return false;
        else {
            for (int i = 2; i <= n/2; i++){
                if (n % i == 0) result = false;
            }
        }
        return result;
    }

    public long sumPrimeNumbers(long[] arr){

        long result = 0;

        for (int i = 0; i < arr.length; i++){
            if (isPrime(arr[i])){
                result += arr[i];
            }
        }
        return result;
    }
}
