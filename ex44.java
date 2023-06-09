import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sn.nextInt();

        int num = sumDigits(n);
        System.out.print("The sum of digits for " + n + " is " + num);
        sn.close();
    }

    public static int sumDigits(int n) {
        int x = n % 10;
        int y = n / 10 % 10;
        int z = n / 100 % 10;
        int digits = x + y + z;
        return digits;
    }

}
