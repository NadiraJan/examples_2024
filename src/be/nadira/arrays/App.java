package be.nadira.arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        char[] chars = {'a', ' ', '?', 'b'};
        char[] filteredChars = CharArrayTools.filterAlphabet(chars);

        System.out.println("The filtered Array looks like this: " +
                Arrays.toString(filteredChars));

        System.out.println();

        char[] charsToSort = {'a', 'd', 'p', 'b', 'm'};


        System.out.println("Before sorting: " + Arrays.toString(charsToSort));

        CharArrayTools.sort(charsToSort);

        System.out.println("After sorting: " + Arrays.toString(charsToSort));


    }
}
