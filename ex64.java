public class ex64 {
    public static void main(String[] args) {
        int[] numint = { 1, 2, 3, 4, 5, 6 };
        double[] numdou = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5 };

        int num1 = average(numint);
        double num2 = average(numdou);
        System.out.println("The average value as integer is " + num1);
        System.out.println("The average value as double is " + num2);

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }
}
