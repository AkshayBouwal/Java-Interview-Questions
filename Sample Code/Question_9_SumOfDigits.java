package Questions;

public class Question_9_SumOfDigits {

    /*

    Write a program to find sum of digits in a number.
    Example: Number = 1234
    Output: 1+2+3+4 = 10

     */

    public static void approach1(int number) {

        int sum = 0;

        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        System.out.println(sum);


    }

    public static void main(String[] args) {

        approach1(1234);

        approach1(128334);

        approach1(12803304);

        approach1(12345);
    }
}
