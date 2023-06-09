public class Q10_099_01 {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Penguin penguin = new Penguin();
        Frog frog = new Frog();
        Fruit fruit = new Fruit();
        Coconut coconut = new Coconut();
        Banana banana = new Banana();
        Orange orange = new Orange();

        System.out.println(pig.sound());
        System.out.println(penguin.sound());
        System.out.println(frog.sound());
        System.out.println(penguin.howToSwim());
        System.out.println(frog.howToSwim());
        System.out.println(penguin.howToSleep());
        System.out.println(frog.howToSleep());
        System.out.println(pig.howToSleep());
        System.out.println(pig.howToEat());
        System.out.println(fruit.howToEat());
        System.out.println(coconut.howToEat());
        System.out.println(orange.howToEat());
        System.out.println(banana.howToEat());
    }
}
