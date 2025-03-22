package interfaces.circle;

public class Circle implements Shape {
    double x;
    double raduis;

    Circle(double x) {
        raduis = x;
    }

    @Override
    public double getSquare() {
        double area = PI * raduis;
        System.out.println("The area of the circle is " + area);
        return area;
    }

}
