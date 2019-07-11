package OOP_Exercise2;

public class Triangle implements Shape {

    private double a, b, c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        a = getEdge(x1, y1, x2, y2);
        b = getEdge(x1, y1, x3, y3);
        c = getEdge(x2, y2, x3, y3);
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public String showInfo() {
        if (!isTriangle(a, b, c)) {
            return "Error value";
        }
        return "Dien tich: " + getArea() + " chu vi: " + getPerimeter();
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
