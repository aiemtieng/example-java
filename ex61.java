import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of array size : ");
        int number = sn.nextInt();

        int[] input = new int[number];
        int i, j;
        int score = 0;
        for (i = 0; i < number; i++) {
            input[i] = (int) (Math.random() * 100);
            if (input[i] % 10 == 4 && input[i] % 10 == 9) {
                score++;
                if (input[i] % 7 == 0)
                    score++;
            }
        }
        System.out.print("{");
        for (j = 0; j < number; j++) {
            System.out.printf("%d ", input[j]);
        }
        System.out.println("\b}");
        System.out.println("You array scores : " + score);
        sn.close();

    }
}
