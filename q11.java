import java.util.*;

class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 0000-7777 :");
        int inp = sc.nextInt();
        if (inp % 10 > 7 || inp / 10 % 10 > 7 || inp / 100 % 10 > 7 || inp / 1000 % 10 > 7)
            System.out.println("error number between 0-1 only!!!");
        else {
            int a = inp % 10;
            int b = inp / 10 % 10;
            int c = inp / 100 % 10;
            int d = inp / 1000 % 10;

            System.out.printf("%s %s %s %s ", bi(d), bi(c), bi(b), bi(a));
        }
    }

    public static String bi(int a) {
        int op = 0;
        int i = 0;
        while (a != 0) {
            op += a % 2 * Math.pow(10, i);
            a /= 2;
            i++;
        }
        return String.format("%03d", op);
    }
}
