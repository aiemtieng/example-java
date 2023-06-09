import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter value");
        double inpx1 = sn.nextDouble();
        double inpy1 = sn.nextDouble();
        double inpx2 = sn.nextDouble();
        double inpy2 = sn.nextDouble();

        int integer = (int) distance(inpx1, inpy1, inpx2, inpy2);

        double doublee = distance(inpx1, inpy1, inpx2, inpy2);

        System.out.println(integer);
        System.out.println(doublee);
        sn.close();
    }

    public static int distance(int a, int b, int c, int d) {
        return (int) Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));
    }

    public static double distance(double a, double b, double c, double d) {
        return Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));
    }

}
