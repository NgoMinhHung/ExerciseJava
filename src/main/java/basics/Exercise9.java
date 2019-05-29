package basics;

public class Exercise9 {
    public float calculatePi(){
        int i = 0;
        float result = 0;
        while(Math.abs(Math.PI - result) >= 0.0001){
            result += (float) 4/(2 * i + 1 ) - (float) 4/(2 * (i + 1) + 1 );
            i += 2;
        }
        return result;
    }
}