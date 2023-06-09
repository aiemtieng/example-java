public class Circle {
    double CirclePi = 3.14;
    private double r;

    Circle() {
        r = 1;
    }

    public Circle(double radius) {
        r = radius;
    }

    public double getArea() {
        return CirclePi * r * r;
    }

    public double getVolume() {
        return (4.0 / 3.0) * CirclePi * r * r * r;
    }

    public double getCircumference() {
        return 2.0 * CirclePi * r;
    }

    public void display() {
        System.out.println("Circle's Area = " + getArea());
        System.out.println("Circle's Volume = " + getVolume());
        System.out.println("Circle's Circumference = " + getCircumference());
    }
}
