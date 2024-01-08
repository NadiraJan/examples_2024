package be.nadira.oop.subEnSuperKlassen;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("White");

        car.accelerate();
        car.turnLeft();
        car.turnRight();
        car.slowDown();
        System.out.println();

        Convertible convertible = new Convertible();
        convertible.setColor("Black");
        convertible.switchToNoRoof();
        convertible.turnLeft();
        convertible.turnRight();
        convertible.slowDown();
        System.out.println(convertible.getColor());
        System.out.println();

        ElectricalCar electricalCar = new ElectricalCar();
        electricalCar.accelerate();
        electricalCar.setColor("Red");
        electricalCar.slowDown();
        electricalCar.turnLeft();
        electricalCar.turnRight();








    }
}
