
//ข้อ5
import java.util.Scanner;
import java.util.Random;

public class ex25 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("scissor(0),rock(1),paper(2): ");

        int x = sn.nextInt();
        int y = ran.nextInt(3) + 1;

        if (x != y) {
            switch (y) {
                case 0:
                    switch (x) {
                        case 1:
                            System.out.print("The computer is scissor. You are rock. You won");
                            break;
                        case 2:
                            System.out.print("The computer is scissor. You are paper. You lose");
                            break;
                    }
                    break;
                case 1:
                    switch (x) {
                        case 2:
                            System.out.print("The computer is rock. You are paper. You won");
                            break;
                        case 0:
                            System.out.print("The computer is rock. You are scissor. You lose");
                            break;
                    }
                    break;
                case 2:
                    switch (x) {
                        case 0:
                            System.out.print("The computer is paper. You are scissor. You won");
                            break;
                        case 1:
                            System.out.print("The computer is paper. You are rock. You lose");
                            break;
                    }
            }
        }

        if (x == y) {
            switch (y) {
                case 0:
                    System.out.println("The computer is scissors. you are scissors too. It is a draw.");
                    break;
                case 1:
                    System.out.println("The computer is rock. you are rock too. It is a draw.");
                    break;
                case 2:
                    System.out.println("The computer is paper. you are paper too. It is a draw.");
                    break;
            }
        }

    }

}
