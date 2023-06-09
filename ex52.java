public class ex52 {
    public static void main(String[] args) {
        Triangle T1 = new Triangle(2, 10, 20);
        Triangle T2 = new Triangle(3, 3, 3);
        System.out.println("First Triangle");
        System.out.println("-----------------------");
        T1.display();
        System.out.println("\n Second Triangle");
        System.out.println("-----------------------");
        T2.display();
    }

    private static class Triangle {
        private double s1, s2, s3;

        public Triangle() {
            s1 = 1;
            s2 = 1;
            s3 = 1;
        }

        public Triangle(double s1, double s2, double s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        public double getS1() {
            return s1;
        }

        public double getS2() {
            return s2;
        }

        public double getS3() {
            return s3;
        }

        public double getArea() {
            return (1.0 / 2.0) * s2 * s3;
        }

        public double getPerimeter() {
            return s1 + s2 + s3;
        }

        public void display() {
            System.out.println("Triangle's area = " + getArea());
            System.out.println("Triangle's perimeter = " + getPerimeter());
        }
    }

}
