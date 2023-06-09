import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer : ");
        int a = sc.nextInt();
        int b = calc(a) % 11;
        if (b != 10) {
            System.out.println("The ISBN-10 number is " + String.format("%09d", a) + b);
        } else {
            System.out.println("The ISBN-10 number is " + String.format("%09d", a) + "x");
        }
    }

    public static int calc(int a) {
        int b = 0;
        int i = 9;
        while (a != 0) {
            b += (a % 10) * i;
            i--;
            a /= 10;
        }
        return b;
    }

}
