import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int a, b, c;
        a = sn.nextInt();
        b = sn.nextInt();
        c = sn.nextInt();

        boolean num = cal(a, b, c);
        System.out.println(num);
        sn.close(); // no add fuc
    }

    public static boolean cal(int a, int b, int c) {
        boolean num, x = true, y = false;
        if ((a > b && a > c) && (c < a && c < b)) {
            num = y;
        } else if ((a > b && a > c) || (c < a && c < b)) {
            num = x;
        } else {
            num = y;
        }
        return num;
    }

}
