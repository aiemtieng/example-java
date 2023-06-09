public abstract class Animal {
    public abstract String sound();

    public String howToSleep() {
        return "";
    }
}

class Frog extends Animal implements Swimmable {

    @Override
    public String sound() {
        return "Frog: Ribbit-Ribbit";
    }

    @Override
    public String howToSleep() {
        return "Frog: May rest more throughout the day when the sun is hot";
    }

    @Override
    public String howToSwim() {
        return "Frog: Swim with their powerful hind legs, and flattened,streamlined body";
    }

}

class Pig extends Animal implements Edible {

    @Override
    public String sound() {
        return "Pig: Oink-Oink";
    }

    @Override
    public String howToSleep() {
        return "Pig: Like to sleep snuggled up together in their nest";
    }

    @Override
    public String howToEat() {
        return "Pig: Grill or Fry it";
    }
}

class Penguin extends Animal implements Swimmable {
    @Override
    public String sound() {
        return "Penguin: Honk-Honk";
    }

    @Override
    public String howToSleep() {
        return "Penguin: Can sleep while floating in the water and standing up on the rocks";
    }

    @Override
    public String howToSwim() {
        return "Penguin: Swim by using them wing that paddle-like flipper";
    }
}