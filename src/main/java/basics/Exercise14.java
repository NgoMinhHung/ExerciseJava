package basics;

public class Exercise14 {
    public double sqrt(int a){
        double result = a;
        double tmp;
        do {
            tmp = result;
            result = a/(2*result) + result/2;
        }while (Math.abs(result - tmp) > 0.0001);
        return result;
    }
}
