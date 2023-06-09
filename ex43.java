public class ex43 {
    public static void main(String[] args) {
        int i;
        double mi;
        System.out.println("i\t\tm(i)");
        System.out.println("______________________");
        for (i = 1; i <= 901; i = i + 100) {
            mi = m(i);
            System.out.printf("%d\t\t%.4f\n", i, mi);
        }
    }

    public static double m(int i) {
        int j;
        double cal = 0;
        for (j = 1; j <= i; j++) {
            cal = cal + ((Math.pow((-1), (j + 1))) / ((2 * j) - 1));
        }
        return 4 * cal;
    }

}
