public class Exercise15 {
    public String checkTriangle(int a, int b, int c){
        String result = new String();
        if(Math.abs(a - b) < c && c < a + b && Math.abs(c - a) < b && b < c + a && Math.abs(b - c) < a && a < b + c){
            result = "La tam giac hop le";
            result = result + "\nChu vi: " + (a+b+c);
            if(a == b || a == c || b == c) result += "\nLa tam giac can";
            if(a == b && b == c) result += "\nLa tam giac deu";
            if(a == Math.sqrt(b*b + c*c) ||b == Math.sqrt(a*a + c*c)||c == Math.sqrt(b*b + a*a)) result += "\nLa tam giac vuong";
        }
        else result = "3 canh khong hop le";
        return result;
    }
}
