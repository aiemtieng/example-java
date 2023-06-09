import java.util.Scanner;

public class q41 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter inner radius : ");
        double a = sn.nextDouble();
        System.out.print("Enter outer radius : ");
        double b = sn.nextDouble();
        System.out.print("Enter inner height : ");
        double c = sn.nextDouble();
        System.out.print("Enter outer height : ");
        double d = sn.nextDouble();

        double x = circularConeVolumeDif(a, b, c, d);
        System.out.printf("The different volume of 2 Circular Cones is : %.2f", x);
        sn.close();
    }

    public static double circularConeVolumeDif(double a, double b, double c, double d) {
        double volume = ((1.0 / 3.0) * Math.PI * Math.pow(b, 2) * (d)) - ((1.0 / 3.0) * Math.PI * Math.pow(a, 2) * (c));
        return volume;

    }

}
