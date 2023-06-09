public class Q09_099_01 {
    public static void main(String[] args) {
        ClosedFigure c1 = new Circle(2.0);
        ClosedFigure c2 = new Circle();
        ClosedFigure c3 = new Circle(3.0, "red");
        ClosedFigure r3 = new Rectangle();
        ClosedFigure r1 = new Rectangle(3.0, 3.3, "blue");
        ClosedFigure r2 = new Rectangle(2.0, 2.2);

        System.out.println(r3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1);
    }
}

class ClosedFigure {
    private String color;

    public ClosedFigure(String color) {
        this.color = color;
    }

    public ClosedFigure() {
        this.color = "White";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "color=" + color;
    }
}

class Circle extends ClosedFigure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public String toString() {
        return "(radius,diameter,area,perimetor,color) = " + "( " + getRadius() + "," + getDiameter() + ","
                + getArea() + ","
                + getPerimeter() + "," + getColor() + ")";
    }
}

class Rectangle extends ClosedFigure {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "(width,length,area,perimeter,color) = " + "(" + getWidth() + "," + getLength() + "," + getArea()
                + "," + getPerimeter() + ","
                + getColor() + ")";
    }
}
