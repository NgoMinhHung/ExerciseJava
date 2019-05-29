public class Exercise19 {
    public long calculateFactorial(int n){
        return (n < 2)? 1 : n * calculateFactorial(n-1);
    }
    public String printLineOfTrianglePascal(int n){
        String result = "";
        for (int i = 0; i <= n; i++){
            long tmp = calculateFactorial(n) / (calculateFactorial(i) * calculateFactorial(n - i));
            result += tmp;
            if(i < n) result += " ";
        }
        return result;
    }
}