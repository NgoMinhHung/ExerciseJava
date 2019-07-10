public class Triangle {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        a = getEdge(x1, y1, x2, y2);
        b = getEdge(x1, y1, x3, y3);
        c = getEdge(x2, y2, x3, y3);
    }

    public double getEdge(double x1, double y1, double x2, double y2) {
        double ex = x1 - x2;
        double ey = y1 - y2;

        return Math.sqrt(ex * ex + ey * ey);
    }

    public boolean isTriangle()
    {
        return a + b > c && b + c > a && c + a > b;
    }

    public String getType() {
        if (!isTriangle()) {
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

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}