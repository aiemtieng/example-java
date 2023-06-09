import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String a = sn.nextLine();

        String b = a.concat(a.substring(0, 2));

        System.out.print(b.substring(2));
        sn.close();

    }

}
