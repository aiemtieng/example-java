
//ข้อ1
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f: ");

        double a = sn.nextDouble();
        double b = sn.nextDouble();
        double c = sn.nextDouble();
        double d = sn.nextDouble();
        double e = sn.nextDouble();
        double f = sn.nextDouble();
        double x = a * d - b * c;

        if (x == 0) {
            System.out.println("The equation has no solution ");
        } else {
            System.out.print("x is " + (e * d - b * f) / x + " and y is " + (a * f - e * c) / x);
        }
    }

}
