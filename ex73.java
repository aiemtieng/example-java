import java.util.Scanner;

public class ex73 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String a = sn.nextLine();

        int n = a.length();
        if (n >= 3) {
            String b = a.substring(n - 3, n);
            String c = b.toUpperCase();
            StringBuilder d = new StringBuilder(a);
            System.out.println((d.delete(n - 3, n)) + c);

        } else {
            String e = a.toUpperCase();
            System.out.print(e);
        }
        sn.close();
    }

}
