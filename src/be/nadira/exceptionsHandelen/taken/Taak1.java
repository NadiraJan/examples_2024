package be.nadira.exceptionsHandelen.taken;

import java.awt.*;
import java.util.Scanner;

public class Taak1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try { int number = Integer.parseInt(kbd.next());
            System.out.println(number);


        }catch (NumberFormatException e) {
            e.printStackTrace();


        }
        System.out.println("anyway");

    }
}
