package be.nadira.oop.subEnSuperKlassen;

public class SUV extends Car{
    private String bullBar;
    public String color;

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void slowDown() {
        super.slowDown();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    public void spinRims(){
        System.out.println("spinningRims");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullBar='" + bullBar + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
