import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter inches as an integer: ");
        int x = sn.nextInt();

        double y = x / 0.3937;
        System.out.print("The value in centimeter is " + y);
    }

}
