import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = sn.nextInt();

        int num = reverse(number);
        System.out.println(num);
        sn.close();
    }

    public static int reverse(int number) {
        int num = 0;
        int i;
        int x = 0, para = number;
        while (para != 0) {
            para /= 10; //
            x++;
        }
        for (i = x - 1; i >= 0; i--) {
            num += (number % 10) * Math.pow(10, i);
            number /= 10;
        }
        return num;

    }
}