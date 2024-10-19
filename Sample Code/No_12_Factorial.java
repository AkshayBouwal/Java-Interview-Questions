package Questions;

public class No_12_Factorial {

    /*
    Write a java program to find a factorial of a number;
     */

    public static void approach1(int number) {

        int product = 1;

        int copyNumber = number;

        while (number >= 1) {

            product = product * number;
            number--;
        }

        System.out.println(copyNumber + "! = " + product);
    }

    public static void main(String[] args) {

        approach1(8);


    }
}
