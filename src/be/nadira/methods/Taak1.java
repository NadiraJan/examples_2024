package be.nadira.methods;

import java.util.Scanner;

public class Taak1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = kbd.nextInt();

        System.out.println("Enter b: ");
        int b = kbd.nextInt();

        System.out.println("Lowest number is: " + lowestValue(a, b));

    }

    public static int lowestValue(int number1, int number2){

        return (number1 > number2)?number2:number1;

        /*if(number1 > number2){
            return number2;

        } else {
            return number1;
        }*/
    }
}
