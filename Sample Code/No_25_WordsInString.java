package Questions;

public class No_25_WordsInString {

    /*
    Write a java program to count words in the string.
     */

    public static void approach1(String inputString) {

        int count = 1;

        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputString.charAt(i) == ' ' && inputString.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println(count);


    }

    public static void approach2(String inputString) {
        System.out.println(inputString.split(" ").length);
    }


    public static void main(String[] args) {

        approach1("harry love java automation o occurred 3 times in the string.");
        approach2("harry love java automation o occurred 3 times in the string.");


        approach1("harry love java automation occurred times in the string.");
        approach2("harry love java automation occurred times in the string.");

    }
}
