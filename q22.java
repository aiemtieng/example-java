
//วงกลมในสี่เหลี่ยม
import java.util.Scanner;
import java.lang.Math;

public class q22 {
  public static void main(String args[]) {
    Double x, y, x1, y1, d;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates:");
    x = scan.nextDouble();
    y = scan.nextDouble();
    x1 = 0.0;
    y1 = 0.0;
    d = Math.sqrt(((x - x1) * (x - x1)) + ((y - y1) * (y - y1)));

    if (d > 6 && (x <= 8 && y <= 7)) {
      System.out.print("Point(" + x + "," + y + ")is in the rantangle but the point is not in the circle");
    } else if (d <= 6 && (x <= 8 && y <= 7)) {
      System.out.print("Point(" + x + "," + y + ")is in the rantangle and the circle");
    } else if (x >= 8 || y >= 7) {
      System.out.print("Point(" + x + "," + y + ")is not the rantangle.");
    }
  }
}
