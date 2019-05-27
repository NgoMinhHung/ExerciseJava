public class Exercise15 {
    public String checkTriangle(int a, int b, int c){
        String result = "";
        if(a < c + b && c < a + b && b < a + c){
            result = "La tam giac hop le";
            result += "\nChu vi: " + (a+b+c);
            if(a == b || a == c || b == c){
                if(a == b && b == c) result += "\nLa tam giac deu";
                else result += "\nLa tam giac can";
            }
            if(a*a == b*b + c*c ||b*b == a*a + c*c||c*c == b*b + a*a) result += "\nLa tam giac vuong";
        }
        else return  "3 canh khong hop le";
        return result;
    }
}
