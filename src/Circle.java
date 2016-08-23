public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2)*Math.PI;
    }

    public double getPerimeter() {
        return 0;
    }
}
