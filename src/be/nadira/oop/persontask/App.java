package be.nadira.oop.persontask;

public class App {
    public static void main(String[] args) {

        Person alex = new Person("Alex", "Kristopher", 33, 190, 85 );
        System.out.println(alex.getName());
        System.out.println(alex.getSurname());
        System.out.println(alex.getAge());

        System.out.println(alex);




    }
}
