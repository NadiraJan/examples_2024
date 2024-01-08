package be.nadira.oop.abstractklassen;

import jdk.swing.interop.SwingInterOpUtils;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
       super(name);
        // OFF :   super.setName(name);
    }

    @Override
    public void move() {
        System.out.println("A cat is walking");
    }

    @Override
    public void makeNoise() {
        System.out.println("A cat is miauwing");
    }


}
