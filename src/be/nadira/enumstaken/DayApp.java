package be.nadira.enumstaken;

import java.util.Locale;

public class DayApp {
    public static void main(String[] args) {

        Day[] days = Day.values();

        for(Day d: days){
            System.out.println("name :: " + d.name().toLowerCase(Locale.ROOT));//name :: monday
            System.out.println("ordinal :: " + d.ordinal());//ordinal :: 0 tem 6
            System.out.println("toString :: " + d); // toString :: Day{WEEKDAY=true} /of{false} toSTRING FROM ENUM


        }
    }
}
