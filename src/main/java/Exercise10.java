public class Exercise10 {
    public double calculatePi(){
        double result = 3;
        int i=2;
        while(Math.abs(3.14159 - result) >= 0.00001) {
            result += Math.pow(-1, i) * (double) 4 / (i * (i + 1) * (i + 2));
            i += 2;
        }
     return result;
    }
}
