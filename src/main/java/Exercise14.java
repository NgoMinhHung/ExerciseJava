public class Exercise14 {
    public float calculateSquareRootOf2(int a){
        float result = a;
        float tmp;
        do {
            tmp = result;
            result = (float) a/(2*result) + (float) result/2;
        }while (Math.abs(result - tmp) > 0.0001);
        return result;
    }
}
