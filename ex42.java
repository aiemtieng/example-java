import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter n,s : ");
        int n;
        double side, ar;
        n = sn.nextInt();
        side = sn.nextDouble();

        ar = area(n, side);
        System.out.println("Area is : " + ar);
        sn.close();
    }

    public static double area(int n, double side) {
        return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
    }

}
