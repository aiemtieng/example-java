import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght : ");
        int Lenght = sc.nextInt();
        int[] a = new int[Lenght + 1];
        System.out.print("Enter the value : ");
        for (int i = 1; i < Lenght + 1; i++) {
            a[i] = sc.nextInt();
        }

        int pst = pos(a);
        int neg = neg(a);
        int total = total(a);
        float average = (float) total / (Lenght);
        System.err.println(average);
        System.out.println("The positive number is : " + pst);
        System.out.println("The negative number is : " + neg);
        System.out.println("Total is : " + total);
        System.out.println("The average is : " + average);
    }

    public static int pos(int[] a) {
        int o = 0;
        for (int i = 1; i < a.length + 1; i++) {
            if (a[i - 1] > 0) {
                o++;
            }
        }
        return o;
    }

    public static int neg(int[] a) {
        int o = 0;
        for (int i = 1; i < a.length + 1; i++) {
            if (a[i - 1] < 0) {
                o++;
            }
        }
        return o;
    }

    public static int total(int[] a) {
        int o = 0;
        for (int i = 1; i < a.length + 1; i++) {
            o += a[i - 1];
        }
        return o;
    }
}