package be.nadira.arrays;

public class CharArrayTools {

    public static char[] filterAlphabet(char[] chars){

        int lengthNeeded = 0;// later nieuwe array te initializeren

        for(char c: chars){
            if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                lengthNeeded++;

            }
        }
        char[] filteredChars = new char[lengthNeeded];

        for(int i = 0, j = 0; i < chars.length; i++){

            char c = chars[i];

            if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                filteredChars[j++] = c; //
            }

        }

        return filteredChars; // nieuwe array krijgen, de originele array onverandbaar
    }


    public static char[] sort(char[] chars){

        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < (chars.length - 1) - i; j++){
                if(chars[j] > chars[j + 1]){

                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        return chars;
    }
}
