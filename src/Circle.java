public class Circle {

    private double radius;
    private final double PI = 3.14159;

    public Circle(double x) {
        radius = x;
    }

    public Circle() {
        radius = 0.0;
    }

    public void setRadius(double x) {
        radius = x;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

}
