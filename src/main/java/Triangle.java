public class Triangle {
    public int x1, x2, x3, y1, y2, y3;


    public double getEdge(double x1, double y1, double x2, double y2) {
        double ex = x1 - x2;
        double ey = y1 - y2;

        return Math.sqrt(ex * ex + ey * ey);
    }

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
        if ((a * a - (b * b + c * c)) * ((b * b - (a * a + c * c))) * ((c * c - (a * a + b * b))) == 0) {
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

    public String getParameterOfTriagle(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3) {

        double a = getEdge(x1, y1, z1, x2, y2, z2);
        double b = getEdge(x1, y1, z1, x2, y2, z2);
        double c = getEdge(x1, y1, z1, x2, y2, z2);

        if (checkTriangle(a, b, c)) {
            return findTypeOfTriangle(a, b, c) + "\nChu vi: " + getPerimeter(a, b, c) + "\nDien tich: " + getAcreage(a, b, c);
        } else return findTypeOfTriangle(a, b, c);
    }
}
