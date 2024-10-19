package Questions;

public class No_19_LinearSearch {

    /*
    Write a java program to find an element using Linear Search
     */


    public static void approach1(String searchElement, String[] input) {

        boolean flag = false;
        for (int i = 0; i < input.length; i++) {

            if (input[i].equals(searchElement)) {
                System.out.println("Element = " + input[i] + " found at  position " + (i + 1));
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(searchElement + " Not present in array");
        }


    }

    public static void main(String[] args) {

        approach1("C--", new String[]{"java", "akshay", "Python", "C++", "C", "java", "Ruby", "JavaScript"});

    }


}
