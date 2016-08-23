import static java.lang.Math.*;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pow(radius, 2)* PI;
    }

    public double getPerimeter() {
        return 2*radius*PI;
    }
}
