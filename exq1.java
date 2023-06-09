import java.util.Scanner;

public class exq1 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter input (A-Z): ");

        char x = sn.next().charAt(0);

        switch (x) {
            case 0:
                System.out.print("This character is Vowel");
                break;
            case 1:
                System.out.print("This character is Consonant");
        }
    }
}