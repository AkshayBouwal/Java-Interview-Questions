package Questions;

public class No_4_ReverseANumber {

    /*

    # Write a program to reverse a given number.
    # Example: Input = 3467
    # Output = 7643

     */

    public static void approach1(int number) {

        while (number > 9) {

            int unitPlace = number % 10;
            number = number / 10;
            System.out.print(unitPlace);

        }

        System.out.print(number);
        System.out.println();

    }

    public static void approach2(int number) {

        while (number != 0) {

            int unitPlace = number % 10;
            number = number / 10;
            System.out.print(unitPlace);

        }


    }

    public static void approach3(int number) {

        System.out.println("Given Number = " + number);

        int reverseNum = 0;

        while (number != 0) {

            reverseNum = (reverseNum * 10) + (number % 10);
            number = number / 10;

        }

        System.out.println("Reverse Number = " + reverseNum);


    }

    public static void approach4(int number) {

        System.out.println("Given Number = " + number);

        StringBuffer sb = new StringBuffer(String.valueOf(number));
        sb.reverse();
        System.out.println("Reverse Number = " + sb);


    }

    public static void approach5(int number) {

        System.out.println("Given Number = " + number);

        StringBuilder sb = new StringBuilder("" + number);
        sb.reverse();
        System.out.println("Reverse Number = " + sb);


    }


    public static void main(String[] args) {

        //approach1(678);

        //approach2(100089);
        //approach2(1000);
        //approach2(10);
        //approach5(10075875);
        approach5(1000);


    }
}
