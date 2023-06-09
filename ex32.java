public class ex32 {
    public static void main(String[] args) {
        System.out.println("Miles\tkilometer\t|\tKilometer\tMiles");
        int x = 20;
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d\t%.3f\t\t|\t%d\t\t%.3f\n", i, i / 0.621, x, x * 0.621);
            x += 5;
        }
    }
}
