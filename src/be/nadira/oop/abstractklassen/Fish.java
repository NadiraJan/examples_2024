package be.nadira.oop.abstractklassen;

public class Fish extends Animal{

    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("A fish swims");
    }

    @Override
    public void makeNoise() {
        System.out.println("A fish can't talk");
    }
}
