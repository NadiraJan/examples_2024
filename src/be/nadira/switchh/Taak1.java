package be.nadira.switchh;

import java.util.Scanner;

public class Taak1 {

    public static void main(String[] args) {

        int day = 0;
        String nameOfDay = " ";
        String dayType = " ";

        boolean isCausal = false;

        Scanner kbd = new Scanner(System.in);
        do {
            System.out.println("Enter you case: ");

            day = kbd.nextInt();


            switch (day) {

                case 1:
                    nameOfDay = "Monday";
                    break;

                case 2:
                    nameOfDay = "Tuesday";
                    break;

                case 3:
                    nameOfDay = "Wednsday";
                    break;

                case 4:
                    nameOfDay = "Thursday";
                    break;

                case 5:
                    nameOfDay = "Friday";
                    isCausal = true;
                    break;


                case 6:
                    nameOfDay = "Saturday";
                    break;

                case 7:
                    nameOfDay = "Sunday";
                    break;

                default:
                    System.out.println("Such day does not exist!");
            }

            System.out.println(nameOfDay);

            switch (day) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:
                    if (isCausal) {
                        System.out.println("Is causally closed, sorry.");

                    }
                    dayType = "Weekday";
                    break;

                case 6:

                case 7:
                    dayType = "DayOff";
                    break;
                default:
                    System.out.println("Invalid day");
            }
        }
        while (day < 1 || day > 7);
        System.out.println(nameOfDay +" is a " + dayType);

    }
    }
