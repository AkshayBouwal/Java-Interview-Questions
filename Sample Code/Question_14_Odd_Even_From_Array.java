package Questions;

public class Question_14_Odd_Even_From_Array {

    /*
    Write a program to print Odd and Even numbers from an array.
     */

    public static void approach1(int[] input) {


        for (int element : input) {

            if (element % 2 == 0) {
                System.out.println("Even : " + element);
            } else {
                System.out.println("Odd : " + element);
            }

        }


    }

    public static void approach2(int[] input) {


        System.out.print("Even Numbers : ");
        for (int element : input) {

            if (element % 2 == 0) {
                System.out.print(element + " ");
            }

        }

        System.out.println();
        System.out.print("Odd Numbers : ");

        for (int element : input) {

            if (element % 2 != 0) {
                System.out.print(element + " ");
            }

        }


    }

    public static void main(String[] args) {

        //approach1(new int[]{1, 2, 5, 7, 8, 3, 10});
        approach2(new int[]{1, 2, 5, 7, 8, 3, 10});


    }
}
