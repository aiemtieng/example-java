
//ข้อ4
import java.util.Random;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sn = new Scanner(System.in);
        System.out.print("Guess the roll [1-6]: ");

        int x = sn.nextInt();
        int y = ran.nextInt(6) + 1;

        if (x == y) {
            System.out.print("Your guess is correct ");
        } else {
            System.out.print("Your guess is incorrect ");
        }

    }
}
