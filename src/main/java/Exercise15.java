public class Exercise15 {

    public boolean checkTriangle(double a, double b, double c) {
        return (a + b > c);
    }

    public String findTypeOfTriangle(double a, double b, double c) {
        if (!checkTriangle(a, b, c)) {
            return "Khong phai tam giac";
        }
        if (a == b && a == c) {
            return "La tam giac deu";
        }
        if (a == b || a == c || b == c) {
            return "La tam giac can";
        }
        if (a * a == (b * b + c * c) || (b * b == (a * a + c * c)) || (c * c == (a * a + b * b))) {
            return "La tam giac vuong";
        }
        return "La tam giac thuong";
    }

    public double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double getAcreage(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String getParameterOfTriangle(double a, double b, double c) {

        if (checkTriangle(a, b, c)) {
            return findTypeOfTriangle(a, b, c) + "\nChu vi: " + getPerimeter(a, b, c) + "\nDien tich: " + getAcreage(a, b, c);
        }else return findTypeOfTriangle(a, b, c);
    }
}
