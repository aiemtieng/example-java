
//สี่เหลี่ยมในวงกลม
import java.util.Scanner;
import java.lang.Math;

public class exq21 {
  public static void main(String args[]) {
    Double x, y, x1, y1, d;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates:");
    x = scan.nextDouble();
    y = scan.nextDouble();
    x1 = 0.0;
    y1 = 0.0;
    d = Math.sqrt(((x - x1) * (x - x1)) + ((y - y1) * (y - y1)));

    if (d <= 7 && (x >= 6 || y >= 5)) {
      System.out.print("Point(" + x + "," + y + ")is in the circle but the point is not in the rectangle");
    } else if (d <= 7 && (x <= 6 && y <= 5)) {
      System.out.print("Point(" + x + "," + y + ")is in the circle and the rectangle");
    } else if (d >= 7) {
      System.out.print("Point(" + x + "," + y + ")is not the circle.");
    }
  }
}