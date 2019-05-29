package basics;

public class Exercise16 {

    public String checkTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        String result = "";
        int a = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        int b = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
        int c = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);

        if (Math.sqrt(a) < Math.sqrt(c) + Math.sqrt(b) && Math.sqrt(c) < Math.sqrt(a) + Math.sqrt(b) && Math.sqrt(b) < Math.sqrt(a) + Math.sqrt(c)) {
            if (a == b + c || b == a + c || c == b + a) {
                result += "La tam giac vuong";
            } else if (a == b || a == c || b == c) {
                if (a == b && b == c) result += "La tam giac deu";
                else result += "La tam giac can";
            } else {
                result += "La tam giac thuong";
            }
            result += "\nChu vi: " + (Math.sqrt(a) + Math.sqrt(b) + Math.sqrt(c));
        } else return "3 canh khong hop le";
        return result;
    }
}
