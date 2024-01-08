package be.nadira.oop.abstractklassen;

public class AnimalApp {
    public static void main(String[] args) {

        Bird bird = new Bird("Bird");
        Cat cat = new Cat("Cat");
        Fish fish = new Fish("Fish");
        Snake snake = new Snake("Snake");

        printAnimal(bird);
        printAnimal(cat);
        printAnimal(fish);
        printAnimal(snake);

    }
    private static void printAnimal(Animal animal){
        System.out.println("Animal name: " + animal.getName());
        animal.move();
        animal.makeNoise();
        System.out.println();
    }
}
