package be.nadira.random;

import java.util.Random;
import java.util.Scanner;

public class GuessedNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner kbd = new Scanner(System.in);

       int guessedNumber = random.nextInt(80);

        boolean isGuessed = true;
        while (isGuessed){
            System.out.println("Enter your number: ");
            int number = kbd.nextInt();
            if(number > guessedNumber){
                System.out.println("Lower");

            } else if(number < guessedNumber){
                System.out.println("Higher");


            } else if(number == guessedNumber){
                System.out.println("You won!!!");
                isGuessed = false;
            }

        }
        System.out.println("You won the game!!!");

    }

}
