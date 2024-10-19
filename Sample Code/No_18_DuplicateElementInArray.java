package Questions;

import java.util.HashSet;

public class No_18_DuplicateElementInArray {

    /*
    Write a program to find duplicate values in an array.
     */


    public static void approach1(String[] input) {

        boolean flag = false;

        for (int i = 0; i < input.length; i++) {


            for (int j = 0; j < input.length; j++) {

                if (i == j) {
                    continue;
                }

                if (input[i] == input[j]) {
                    System.out.println("Duplicate Value Found: " + input[j]);
                    flag = true;

                }

            }

        }

        if (!flag) {
            System.out.println("No Duplicate Values Found");
        }

    }

    public static void approach2(String[] input) {

        HashSet<String> set = new HashSet<>();

        boolean flag = false;

        for (String element : input) {

            if (set.add(element)) {

            } else {
                System.out.println(element + " is duplicate Element");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No Duplicate Found");
        }


    }

    public static void main(String[] args) {

        // approach1(new String[]{"java", "akshay", "Python", "C++", "C", "java", "Ruby", "JavaScript"});

        approach2(new String[]{"java", "akshay", "Python", "C++", "C", "java", "Ruby", "JavaScript"});

    }
}
