public class Exercise6 {
    public void GPTB2(int a, int b, int c){
        if(a==0 && b!= 0) System.out.println(c/b);
        else if(a == 0 && b == 0 && c != 0) System.out.println("vo nghiem");
        else if(a == 0 &&b == 0 && c == 0) System.out.println("vo so nghiem");
        else if(a != 0) {
            int delta = b * b - 4 * a * c;
            if (delta > 0)
                System.out.println("x1= " + (float) (-b - Math.sqrt(delta)) / (2 * a) + "x2= " + (float) (-b + Math.sqrt(delta)) / (2 * a));
            else if (delta == 0) System.out.println("x= " + -b / (2 * a));
            else System.out.println("vo nghiem");
        }
    }
}
