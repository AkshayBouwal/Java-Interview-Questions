package Questions;

public class Question_8_Even$OddCount {

    /*

    Write a program to count Even and Odd digits in a given number.
    Example: 68945
    Even Count = 3
    Odd Count = 5

     */

    public static void approach1(int number) {

        int evenCount = 0;
        int oddCount = 0;

        while (number > 0) {

            if ((number % 10) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            number = number / 10;
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);

    }

    public static void main(String[] args) {

        //approach1(136489);
        //approach1(753159);
        approach1(1234);


    }
}
