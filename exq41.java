import java.util.Scanner;

public class exq41 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter value of width : ");
        double length = sn.nextDouble();
        System.out.print("Enter value of length : ");
        double width = sn.nextDouble();
        System.out.print("Enter inner depth : ");
        double deptout = sn.nextDouble();
        System.out.print("Enter outer depth : ");
        double deptin = sn.nextDouble();

        double num = rectangleBoxVolumeDif(length, width, deptout, deptin);
        System.out.print("The different volume of 2 Rectangle Boxes is : " + num);
        sn.close();
    }

    public static double rectangleBoxVolumeDif(double length, double width, double deptout, double deptin) {
        double volume = length * width * (deptin - deptout);
        return volume;
    }

}
