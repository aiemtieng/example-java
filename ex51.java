
// UML class diagram:
//     +--------------------+       
//     |       Circle        |      
//     +--------------------+       
//     |+<<constant>>CirclePi:double=3.14|
//     |      -r:double      |
//       --------------------    
//     |+Circle(radius:double)|       
//     |   +getArea():double  |    
//     |  +getVolume():double |
//     | +getCircumference():double |       
//     +--------------------+
public class ex51 {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        Circle c2 = new Circle(3);
        System.out.println("First Circle");
        System.out.println("------------------------");
        c1.display();
        System.out.println("\n Second Circle");
        System.out.println("------------------------");
        c2.display();
    }

    public static class Circle {
        public static final double PI = 3.14;
        private double r;

        public Circle(double radius) {
            this.r = radius;
        }

        public double getArea() {
            return PI * r * r;
        }

        public double getVolume() {
            return 4.0 / 3.0 * PI * r * r * r;
        }

        public double getCircumference() {
            return 2 * PI * r;
        }

        public void display() {
            System.out.println("Circle's Area = " + getArea());
            System.out.println("Circle's Volume = " + getVolume());
            System.out.println("Circle's Circumference = " + getCircumference());
        }
    }
}
