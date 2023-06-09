import java.util.Scanner;

public class ex1 {

   public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      System.out.print("Please enter input (A-Z): ");

      char x = sn.next().charAt(0);

      switch (x) {
         case 'A':
            System.out.print("This character is Vowel");
            break;
         case 'E':
            System.out.print("This character is Vowel");
            break;
         case 'I':
            System.out.print("This character is Vowel");
            break;
         case 'O':
            System.out.print("This character is Vowel");
            break;
         case 'U':
            System.out.print("This character is Vowel");
            break;
         default:
            System.out.print("This character is Consonant");
      }
   }
}
