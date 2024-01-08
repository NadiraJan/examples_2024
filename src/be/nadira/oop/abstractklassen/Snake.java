package be.nadira.oop.abstractklassen;

public class Snake extends Animal{

    public Snake() {
        //OF:  this(null);
    }

    public Snake(String name) {
        super(name);


    }

    @Override
    public void move() {
        System.out.println("A snake crawls ");
    }

    @Override
    public void makeNoise() {
        System.out.println("A snake is hissing");
    }
}
