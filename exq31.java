public class exq31 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j <= n; j++) {
                int num = 5;
                num += j;
                System.out.printf("%d\t", num);

            }
            n++;
            System.out.println();
        }
    }
}
