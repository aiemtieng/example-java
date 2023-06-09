import java.util.Scanner;
import java.util.Arrays;

public class ex63 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int i;
        double[] array = new double[10];
        for (i = 0; i < 10; i++) {
            array[i] = sn.nextDouble();
        }
        int num = indexOfSmallestElement(array);
        System.out.println("The index of the min is : " + num);
        sn.close();
    }

    public static int indexOfSmallestElement(double[] array) {
        double samp = Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (samp > array[i]) {
                samp = array[i];
                x = i;
            }
        }
        return x;
    }

}
