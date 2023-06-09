import java.util.Scanner;

public class q32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
    int m = sc.nextInt();
    System.out.print("Enter number of columns : ");
    int n = sc.nextInt();
    int s = 0, fs = 0, sn = 0, d = 0, u = 0;
    int[] num1, num2;
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        int a = (int) (Math.random() * 4000 - 500);
        s += a;
        System.out.printf("%d\t", a);
        if (a % 4 == 0 && a % 7 == 0) {
          fs++;
        }
        if (a % 7 == 0 && a % 9 == 0) {
          sn++;
        }
      }
      System.out.println();
    }
    System.out.println("Summary is " + s);
    System.out.println("divisible by 4 and 7 is " + fs);
    System.out.println("divisible by 7 and 9 is " + sn);
    sc.close();
  }
}
