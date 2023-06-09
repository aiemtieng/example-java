public class ex33 {
    public static void main(String[] args) {
        int num = 1, x = 1, p = 8;
        for (int en = 1; en < 10; en++) {
            for (int t = p; t >= 0; t--) {
                System.out.printf("\t");
            }
            for (int j = 1; j <= x; j++) {
                System.out.printf("%d\t", num);
                num++;
            }
            // for (int t = p; t >= 0; t--) {
            // System.out.printf("\t");
            // }
            x += 2;
            p--;
            System.out.print("\n");
        }
    }
}