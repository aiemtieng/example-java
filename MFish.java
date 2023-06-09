public class MFish {
    public static void main(String[] args) {
        Fish fish = new Fish(0.3);
        Fish shark = new Shark(200);
        Fish mFish = new MechanicalFish(1.2);
        Fish sdFish = new SaltedDriedFish(2.5);
        System.out.print(fish);
        fish.swim();
        System.out.print(shark);
        shark.swim();
        System.out.print(mFish);
        mFish.swim();
        System.out.print(sdFish);
        sdFish.swim();
    }

}

class Fish {
    private double weight;

    public Fish(double weight) {
        this.weight = weight;
    }

    public void swim() {
        System.out.println("All fish swim.");
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        return "I am a " + weight + "kg fish. ";
    }
}

class Shark extends Fish {
    public Shark(double weight) {
        super(weight);
    }

    public String toString() {
        return "I am a " + getWeight() + "kg shark. ";
    }
}

class MechanicalFish extends Fish {
    public MechanicalFish(double weight) {
        super(weight);
    }

    public void swim() {
        System.out.println("I float in water");
    }

    public String toString() {
        return "I am a " + getWeight() + "kg mechanical. ";
    }
}

class SaltedDriedFish extends Fish {
    public SaltedDriedFish(double weight) {
        super(weight);
    }

    public void swim() {
        System.out.println("I am dead and I no longer swim");
    }

    public String toString() {
        return "I am a " + getWeight() + "kg salted dried fish. ";
    }
}
