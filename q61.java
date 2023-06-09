import java.util.Scanner;

public class q61 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int number = sn.nextInt();

    int i, j;
    int[][] array = new int[5][5];
    int score = 0;
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        array[i][j] = (int) (Math.random() * 6);
        System.out.printf("%d  ", array[i][j]);
        if (array[i][j] == number) {
          score++;
        }

      }
      System.out.print("\n");
    }
    System.out.print("Your number appears " + score + " times in this Matrix");

  }
}
