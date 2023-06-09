import java.util.Scanner;

public class ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] first = new double[3][3];
        double[][] sec = new double[3][3];
        double[][] op = new double[3][3];

        System.out.print("Enter matrix 1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter matrix 2 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sec[i][j] = sc.nextInt();
            }

        }

        op = matrix(first, sec);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f\t", first[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f\t", sec[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f\t", op[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] matrix(double[][] a, double[][] b) {
        double[][] op = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                op[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
            }
        }
        return op;
    }
}
