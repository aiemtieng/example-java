import java.util.Scanner;

public class ex74 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String a = sn.nextLine();
        System.out.print("The summation of number is : " + sumNumber(a));
    }

    public static int sumNumber(String str) {
        int sum = 0, temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                temp = temp * 10 + (str.charAt(i) - '0');
            } else {
                sum += temp;
                temp = 0;
            }
        }
        sum += temp;
        return sum;
    }
}
