package Questions;

public class No_10_FibonacciSeries {

    /*
    Write a program for Fibonacci Series
     */

    public static void approach1(int firstNum, int secondNum, int numberOfElement) {


        System.out.print("Fibonacci Series: " + firstNum + "," + secondNum + ",");

        int count = 2;
        int sum;

        while (numberOfElement > count) {


            sum = firstNum + secondNum;

            if ((numberOfElement - 1) == count) {
                System.out.print(sum + ".");
                break;
            } else {
                System.out.print(sum + ",");
                firstNum = secondNum;
                secondNum = sum;
                count++;
            }


        }

    }

    public static void approach2(int firstNum, int secondNum, int numberOfElement) {


        System.out.print("Fibonacci Series: " + firstNum + "," + secondNum + ",");

        int count = 2;

        for (int i = count; i < numberOfElement; i++) {

            int sum = firstNum + secondNum;

            if ((numberOfElement - 1) == i) {
                System.out.print(sum + ".");
            } else {
                System.out.print(sum + ",");
                firstNum = secondNum;
                secondNum = sum;

            }


        }


    }

    public static void main(String[] args) {

        approach1(0, 1, 10);
        //approach2(0, 1, 10);


    }
}
