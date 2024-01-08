package be.nadira.oop.subEnSuperKlassen;

public class Convertible extends Car{

    private String sunroof;
 //   public String color;


    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }

   /* @Override
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
    }*/

    public void switchToNoRoof(){
        System.out.println("Putting the top down in our convertible");
    }


}
