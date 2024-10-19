package Questions;

public class No_11_PrimeNumber {

    /*
    Write a program to check whether a given number is Prime or Not
     */

    public static void approach1(int number) {

        int count = 0;

        if (number > 1) {

            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {
                    count++;
                }
            }

            if (count != 0) {
                System.out.println(number + " is not a Prime Number");
            } else {
                System.out.println(number + " is a Prime Number");
            }

        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {

        approach1(3);



    }


}
