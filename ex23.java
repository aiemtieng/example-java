
//ข้อ3
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sn.nextInt();

        if (x % 3 == 0 && x % 11 == 0) {
            System.out.println(x + " is divisible by both 3 or 11");
        } else if (x % 3 != 0 && x % 11 != 0) {
            System.out.print(x + " is not divisible by either 3 or 11");
        }
        if (x % 3 == 0 && x % 11 != 0) {
            System.out.print(x + " is divisble by both 3 or 11,but not both");
        }
    }
}
