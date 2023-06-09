import java.util.Scanner;

public class ex65 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int i;
        double[] array = new double[5];
        for (i = 0; i < array.length; i++) {
            System.out.print("Read a number :");
            array[i] = sn.nextDouble();
        }
        sn.close();

        int p = 10;
        for (i = 0; i < array.length; i++) {
            int ran = (int) (Math.random() * 5);
            if (ran != p) {
                double samp = array[ran];
                array[ran] = array[i];
                array[i] = samp;
                p = ran;
            } else
                i--;
        }

        for (i = 0; i < array.length; i++) {
            System.out.printf("%.1f\n", array[i]);
        }

    }

}
