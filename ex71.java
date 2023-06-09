import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String a = sn.nextLine();

        char ch = a.charAt(1);
        if (ch == 'e' || ch == 'E') {
            System.out.print("Your message is : true ");
        } else {
            System.out.print("Your message is : false ");
        }
        sn.close();
    }

}
