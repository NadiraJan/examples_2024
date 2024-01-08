package be.nadira.oop.abstractklassen;

public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("A bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("A bird is whistling");
    }
}
