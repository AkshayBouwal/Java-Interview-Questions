package Questions;

public class Question_2_CapitalizeInitial {

    /*

    # Suppose you have given a String having uneven of spaces and every word of string in lower case.
    # Write a program to have only one space between words and first alphabet of each word should be in upper case.

    # Example: harry     love   java     automation.
    #Output: Harry Love Java Automation.

     */


    public static void approach1(String inputString) {

        String updateStr = inputString.replaceAll("\\s{2,}", " ").trim();
        //System.out.println(updateStr);

        String[] word = updateStr.split(" ");

        for (String element : word) {
            System.out.print(element.substring(0, 1).toUpperCase() + element.substring(1) + " ");
        }

        System.out.println();
    }

    public static void approach2(String inputString) {

        String updateStr = inputString.replaceAll("\\s{2,}", " ").trim();

        String[] word = updateStr.split(" ");

        for (String element : word) {

            int firstChar = element.charAt(0);
            System.out.print((char) (firstChar - 32) + element.substring(1) + " ");
        }

        System.out.println();
    }

    public static void approach3(String inputString) {

        String updateStr = inputString.replaceAll("\\s{2,}", " ").trim();


        String[] word = updateStr.split(" ");

        for (int i = 0; i < word.length; i++) {

            if (i != (word.length - 1)) {

                System.out.print(word[i].substring(0, 1).toUpperCase() + word[i].substring(1) + " ");
            } else {

                System.out.print(word[i].substring(0, 1).toUpperCase() + word[i].substring(1));
            }


        }

        System.out.println();
    }


    public static void main(String[] args) {

//        approach1("harry     love   java     automation.");
//        approach1("akshay");

//        approach2("harry     love   java     automation.");
//        approach2("akshay");

        approach3("harry     love   java     automation.");
        //approach2("akshay");


    }
}
