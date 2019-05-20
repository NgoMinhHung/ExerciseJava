public class Exercise9 {
    public float calculatePi(){
        int i = 0;
        float result = 0;
        while(Math.abs(3.1415 - result) >= 0.0001){
            if(i % 2 == 0) result += (float) 4/(2 * i + 1 );
            else result -= (float) 4/(2 * i + 1 );
            i++;
        }
        return result;
    }
}