public class q42 {
    public static void main(String[] args) {
        double cal = calPerimeter(10);
        System.out.print(cal);
    }

    public static double calPerimeter(double r) {
        double cir = 2 * Math.PI * r;
        return cir;
    }

    public static double calPerimeter(double a, double b, double c) {
        double tri = a * b * c;
        return tri;
    }

    public static double calPerimeter(double w, double l) {
        double sqr = w * l;
        return sqr;
    }

}
