package Questions;

public class Question_22_RemoveSpecialChar {

    /*
    Write a java program to remove all the special characters from a string.
     */

    public static void approach(String inputString) {

        System.out.println(inputString.replaceAll("[^A-Za-z0-9|.| ]", "NN"));

    }

    public static void main(String[] args) {

        approach("IntelliJ IDEA Community Edition 2023.2.3 !#!$!$%@$%@$%@%$@%@$%()_+*/*-+");
    }
}
