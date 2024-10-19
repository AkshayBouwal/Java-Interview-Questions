package Questions;

public class No_24_CharCount {

    /*
    Write a java program to count occurrence of a char in a String.
     */

    public static void approach1(String inputString, char charOccurrence) {

        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charOccurrence) {
                count++;
            }
        }

        System.out.println(charOccurrence + " occurred " + count + " times in the string.");

    }

    public static void approach2(String inputString, char charOccurrence) {


        String updated = inputString.replace(String.valueOf(charOccurrence), "");


        System.out.println(charOccurrence + " occurred " + (inputString.length() - updated.length()) + " times in the string.");

    }


    public static void main(String[] args) {


        approach1("harry love java automation.", 'o');
        approach2("harry love java automation.", 'o');


    }
}
