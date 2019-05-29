public class Exercise15 {
    public String checkTriangle(int a, int b, int c){
        String result = "";
        if(a < c + b && c < a + b && b < a + c){
            if(a*a == b*b + c*c ||b*b == a*a + c*c||c*c == b*b + a*a){
                result += "La tam giac vuong";
            }
            else
            if(a == b || a == c || b == c){
                if(a == b && b == c){
                    result += "La tam giac deu";
                }
                else result += "La tam giac can";
            }
            else{
                result += "La tam giac thuong";
            }
            result += "\nChu vi: " + (a+b+c);
        }
        else return  "3 canh khong hop le";
        return result;
    }
}
