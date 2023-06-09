public interface Edible {
    public String howToEat();
}

class Fruit implements Edible {
    public String howToEat() {
        return "Fruit: is healthy food";
    }
}

class Coconut extends Fruit {
    @Override
    public String howToEat() {
        return "Coconut: Refreshing with ice coconut water";
    }
}

class Banana extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make Orange Juice";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Banana: Make Healthy Banana Smoothie";
    }
}
