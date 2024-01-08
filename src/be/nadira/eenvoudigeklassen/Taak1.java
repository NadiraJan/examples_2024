package be.nadira.eenvoudigeklassen;

import java.util.Scanner;

public class Taak1 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = kbd.nextLine();

        Integer value = Integer.parseInt(input);

        value += 5;
        System.out.println(value);
    }
}
