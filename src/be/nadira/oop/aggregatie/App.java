package be.nadira.oop.aggregatie;

public class App {
    public static void main(String[] args) {

        Garage garage = new Garage("Verstraeten NV");
        Auto auto = new Auto("BMW", garage);

        Garage garage1 = new Garage("Minnekens");
        Auto auto1 = new Auto("Nissan", garage1);


        System.out.println(auto);
        System.out.println(auto1);

    }
}