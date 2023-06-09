import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Select data type of all number 1.int 2.double : ");
        int x = sn.nextInt();
        double i1, i2, i3, i4, i5;
        switch (x) {
            case 1:
                System.out.print("Enter five number : ");
                i1 = sn.nextInt();
                i2 = sn.nextInt();
                i3 = sn.nextInt();
                i4 = sn.nextInt();
                i5 = sn.nextInt();

                double integer = average(i1, i2, i3, i4, i5);
                System.out.print("Average value : " + integer);
                break;

            case 2:
                System.out.print("Enter five number : ");
                i1 = sn.nextDouble();
                i2 = sn.nextDouble();
                i3 = sn.nextDouble();
                i4 = sn.nextDouble();
                i5 = sn.nextDouble();

                double doublee = average(i1, i2, i3, i4, i5);
                System.out.print("Average value : " + doublee);
                break;

        }
    }

    public static int average(int i1, int i2, int i3, int i4, int i5) {
        int x = (i1 + i2 + i3 + i4 + i5) / 5;
        return x;
    }

    public static double average(double i1, double i2, double i3, double i4, double i5) {
        double y = (i1 + i2 + i3 + i4 + i5) / 5;
        return y;
    }
}
