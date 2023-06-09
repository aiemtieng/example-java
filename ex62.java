import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of array size : ");
        int number = sn.nextInt();

        int[] max = new int[4];
        System.out.print("Your number 1 : ");
        int a = sn.nextInt();
        System.out.print("Your number 2 : ");
        int b = sn.nextInt();
        System.out.print("Your number 3 : ");
        int c = sn.nextInt();
        System.out.print("Your number 4 : ");
        int d = sn.nextInt();

        int[] input = new int[number];
        int i;
        for (i = 0; i < number; i++) {
            input[i] = (int) (Math.random() * 10);
            if (input[i] == a) {
                max[0]++;
            }
            if (input[i] == b) {
                max[1]++;
            }
            if (input[i] == c) {
                max[2]++;
            }
            if (input[i] == d) {
                max[3]++;
            }
        }
        System.out.print("Your array : ");
        System.out.print("{");
        for (i = 0; i < number; i++) {
            System.out.printf("%d ", input[i]);
        }
        System.out.println("\b}");

        int fre = Integer.MIN_VALUE;
        for (i = 0; i < 4; i++) {
            fre = max[i];
            if (fre < max[i])
                fre = max[i];
        }
        sn.close();
        System.out.print("MaxFrequency " + fre);
    }

}
