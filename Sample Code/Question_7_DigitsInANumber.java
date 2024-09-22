package Questions;

public class Question_7_DigitsInANumber {

    /*
    Write a program to find no. of digits in a Number;
    Example: 12345
    Output: 5
     */

    public static void approach1(int number) {

        int count = 1;

        while (number > 9) {

            number = number / 10;
            count++;

        }
        System.out.println(count);

    }

    public static void approach2(int number) {

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        System.out.println(count);

    }

    public static void main(String[] args) {


        approach2(130450689);
        approach2(789);

    }
}
