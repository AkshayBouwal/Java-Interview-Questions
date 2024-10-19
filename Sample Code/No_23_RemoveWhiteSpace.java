package Questions;

public class No_23_RemoveWhiteSpace {

    /*
    Write a java program to remove extra spaces from the String
     */

    public static void approach1(String inputString) {

        String updateStr = inputString.replaceAll("\\s{2,}", " ").trim();
        System.out.println(updateStr);


    }

    public static void approach2(String inputString) {

        String updateStr = inputString.replaceAll("[ ]{2,}", " ").trim();
        System.out.println(updateStr);


    }

    public static void main(String[] args) {

        approach2("harry     love   java        automation.");


    }
}
