public class Exercise28 {

    public double sqrt(double n){
        double result = 1.0f;

        while (Math.abs(result * result - n) / n >= 0.0001f)
            result = (n / result - result) / 2 + result;
        return result;
    }
}
