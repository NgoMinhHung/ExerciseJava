public class Exercise10 {
    public double calculatePi(){
        double condition, result = 3;
        int i=2;
         do {
             condition =(float) 4/(i*(i+1)*(i+2)) - (float) 4/((i+2)*(i+3)*(i+4));
             result += condition;
             i += 4;
        }while(condition >= 0.00001);
     return result;
    }
}