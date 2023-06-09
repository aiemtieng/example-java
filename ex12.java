import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter an integer between 000 and 999: ");
        int x = sn.nextInt();

        int y = x % 10;
        int z = x / 10 % 10;
        int a = x / 100 % 10;
        int b = y * z * a;
        System.out.print("The product of digits is " + b);

    }

}
