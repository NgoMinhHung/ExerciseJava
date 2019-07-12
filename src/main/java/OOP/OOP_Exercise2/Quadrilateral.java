package OOP.OOP_Exercise2;

public class Quadrilateral implements Shape {

    private double a, b, c, d, dc1, dc2;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.a = getEdge(x1, y1, x2, y2);
        this.b = getEdge(x2, y2, x3, y3);
        this.c = getEdge(x3, y3, x4, y4);
        this.d = getEdge(x4, y4, x1, y1);
        this.dc1 = getEdge(x1, y1, x3, y3);
        this.dc2 = getEdge(x2, y2, x4, y4);
    }
    public boolean isQuadrilateral(){
        double [][] triangle= {{a,b,dc1},{c,d,dc1},{a,d,dc2},{b,c,dc2}};
        for(int i=0;i<triangle.length;i++){
            if(!Triangle.isTriangle(triangle[i][0],triangle[i][1],triangle[i][2])){
                return false;
            }
        }
        return true;
    }
    public static double getAreaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String showInfo() {
        if (!isQuadrilateral()) {
            return "Error value";
        } else {
            return "Dien tich: " + getArea() + " Chu vi: " + getPerimeter();
        }
    }

    @Override
    public double getArea() {
        double s1 = getAreaOfTriangle(a, b, dc1) + getAreaOfTriangle(c, d, dc1);
        double s2 = getAreaOfTriangle(a, d, dc2) + getAreaOfTriangle(b, c, dc2);
        return s1 > s2 ? s2 : s1;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }
}
