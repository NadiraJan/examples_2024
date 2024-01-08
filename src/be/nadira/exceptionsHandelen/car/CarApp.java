package be.nadira.exceptionsHandelen.car;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Car(4, true, 0);
        System.out.println("Car is driving");

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your radio diapason");
        String input = kbd.next();

        try {
            int radioStation = Integer.parseInt(input);
            car.setRadioStation(radioStation / 0);

        } catch (NumberFormatException e) {
            e.printStackTrace();

        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();

        } finally {
            System.out.println("Run this code anyway");
            System.out.println("closing stuff");
            kbd.close();
        }

        try {
            car.setNumberOfWheels(5);
        } catch (Exception exception) {
            // System.out.println("wheel issue");
            exception.printStackTrace();

        }


/*try {
            Thread.sleep(3000); // na 3 seconden car is driving verschijnt
        } catch (InterruptedException e) {
            e.printStackTrace();

        }*/
        System.out.println("Car is driving");
    }
}
