
//นักษัตร
import java.util.Scanner;

public class exq22 {
    public static void main(String[] args) {
        int year, leap, animal;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year:");
        year = in.nextInt();
        leap = year % 4;
        animal = year % 12;
        if (leap == 0)
            System.out.print(year + " is a leap year.");
        else
            System.out.print(year + " is not a leap year.");
        switch (animal) {
            case 0:
                System.out.print("The Chinese zodiac of " + year + " is Monkey");
                break;
            case 1:
                System.out.print("The Chinese zodiac of " + year + " is Rooster");
                break;
            case 2:
                System.out.print("The Chinese zodiac of " + year + " is Dog");
                break;
            case 3:
                System.out.print("The Chinese zodiac of " + year + " is Pig");
                break;
            case 4:
                System.out.print("The Chinese zodiac of " + year + " is Rat");
                break;
            case 5:
                System.out.print("The Chinese zodiac of " + year + " is Ox");
                break;
            case 6:
                System.out.print("The Chinese zodiac of " + year + " is Tiger");
                break;
            case 7:
                System.out.print("The Chinese zodiac of " + year + " is Rabbit");
                break;
            case 8:
                System.out.print("The Chinese zodiac of " + year + " is Dragon");
                break;
            case 9:
                System.out.print("The Chinese zodiac of " + year + " is Snake");
                break;
            case 10:
                System.out.print("The Chinese zodiac of " + year + " is Horse");
                break;
            case 11:
                System.out.print("The Chinese zodiac of " + year + " is Sheep");
                break;
        }
    }
}