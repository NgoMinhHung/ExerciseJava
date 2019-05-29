package basics;

public class Exercise6 {
    public String solveQuadraticEquation(int a, int b, int c){
        String s = "";
        if(a == 0 && b != 0) {
            s = "x= " + (float) -c/b;
        }
        if(a == 0 && b == 0){
            if(c == 0){
                s = "vo so nghiem";
            }
            else s = "vo nghiem";
        }
        else if(a != 0) {
            int delta = b * b - 4 * a * c;
            float x,x1,x2;
            if (delta > 0){
                x1 = (float)(-b - Math.sqrt(delta)) / (2 * a);
                x2 = (float)(-b + Math.sqrt(delta)) / (2 * a);
                s ="x1= " + x1 + " , " +"x2= " + x2;
            }
            if (delta == 0){
                x = (float)-b/(2*a);
                s = "x= " + x;
            }
            if(delta < 0) {
                s = "vo nghiem";
            }
        }
        return s;
    }
}
