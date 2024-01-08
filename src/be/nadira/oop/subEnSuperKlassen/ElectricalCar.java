package be.nadira.oop.subEnSuperKlassen;

public class ElectricalCar extends Car{

    private String battery;
 //   public String color;


    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void accelerate() {
        System.out.println("Electrical car is accelerating...");
    }


}
