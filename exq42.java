import java.util.Scanner;

public class exq42 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("1.sphere 2.circular cone 3.rectangle box : ");
        int a = sn.nextInt();

        switch (a) {
            case 1:
                System.out.print("Enter value of width : ");
                int w = sn.nextInt();
                System.out.print("Enter value of length : ");
                int l = sn.nextInt();
                System.out.print("Enter value of height : ");
                int h = sn.nextInt();

                int sph = calSurface(w, l, h);
                System.out.print("The area of sphere is : " + sph);
                break;

            case 2:
                System.out.print("Enter value of radius : ");
                double r = sn.nextDouble();

                double cir = calSurface(r);
                System.out.print("The area of circular cone is : " + cir);
                break;

            case 3:
                System.out.print("Enter value of radius : ");
                r = sn.nextDouble();
                System.out.print("Enter value of height : ");
                h = sn.nextInt();

                double rec = calSurface(h, r);
                System.out.print("The area of rectangle box is : " + rec);
                break;
        }

    }

    public static int calSurface(int w, int l, int h) {
        return ((2 * l * w) + (2 * w * h) + (2 * h * l));
    }

    public static double calSurface(double r) {
        return (4 * (Math.PI * r));
    }

    public static double calSurface(int h, double r) {
        return Math.pow((Math.pow(r, (2)) * Math.pow(h, (2))), 0.5);
    }

}
