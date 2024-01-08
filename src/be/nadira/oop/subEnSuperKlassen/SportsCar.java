package be.nadira.oop.subEnSuperKlassen;

public class SportsCar extends Car {

    private String spoiler;
   // public String color;


    public String getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(String spoiler) {
        this.spoiler = spoiler;
    }

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

    public void setRaceMode(){
        System.out.println("Switching to Race Mode");
    }


}
