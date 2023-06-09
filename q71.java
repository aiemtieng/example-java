import java.util.Scanner;

public class q71 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = scan.nextLine();
    System.out.print("Enter a character : ");
    char ch = scan.next().charAt(0);
    System.out.println("Number of " + ch + " = " + countStr(str, ch));
  }
  
  public static int countStr(String str, char ch) {
    int num = 0;
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ch) {
        num++;
      }
    }
    return num;
  }
}
