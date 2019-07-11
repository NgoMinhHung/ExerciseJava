package OOP_Exercise2;

public interface Shape {

    public String showInfo();
    public double getArea();
    public double getPerimeter();
    default public double getEdge(double x1, double y1, double x2, double y2) {
        double ex = x1 - x2;
        double ey = y1 - y2;

        return Math.sqrt(ex * ex + ey * ey);
    }
}
