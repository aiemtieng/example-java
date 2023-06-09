import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter input (A-Z) : ");
        char a = sn.next().charAt(0);

        switch (a) {
            case 'A':
                System.out.print("Vowel");
                break;

            case 'E':
                System.out.print("Vowel");
                break;

            case 'I':
                System.out.print("Vowel");
                break;

            case 'O':
                System.out.print("Vowel");
                break;

            case 'U':
                System.out.print("Vowel");

            case 'a':
                System.out.print("Vowel");
                break;

            case 'e':
                System.out.print("Vowel");
                break;

            case 'i':
                System.out.print("Vowel");
                break;

            case 'o':
                System.out.print("Vowel");
                break;

            case 'u':
                System.out.print("Vowel");
                break;

            default:
                System.out.print("Consonant");
                break;
        }
    }

}
