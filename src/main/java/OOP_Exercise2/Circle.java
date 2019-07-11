package OOP_Exercise2;

public class Circle implements Shape {

    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String showInfo() {
        if (r < 0) {
            return "Error value";
        } else {
            return "Dien tich: " + getArea() + " Chu vi: " + getPerimeter();
        }
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
