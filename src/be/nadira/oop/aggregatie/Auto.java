package be.nadira.oop.aggregatie;

public class Auto {

    private String brand;
    private Garage garage;

     public Auto(String brand) {
        this.brand = brand;

    }
    public Auto(String brand, Garage garage) {
         this.brand = brand;
         this.garage = garage;

    }

    public Auto(Auto auto){
         this.brand = auto.brand;
         this.garage = auto.garage;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }



    @Override
    public String toString() {
        return "Auto: " + brand + " en " + " Garage: " + garage.getName(); //eigen variant om af te drukken


    }
}
