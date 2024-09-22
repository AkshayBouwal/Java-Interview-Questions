package Questions;

import java.util.Arrays;

public class Question_15_ArrayCompare {

    /*
    Write a program to compare to Arrays and return true is both the arrays are equal otherwise false;
     */


    public static boolean approach1(int[] inputArray1, int[] inputArray2) {

        return Arrays.equals(inputArray1, inputArray2);

    }

    public static boolean approach2(int[] inputArray1, int[] inputArray2) {

        if (inputArray1.length == inputArray2.length) {

            for (int i = 0; i < inputArray1.length; i++) {

                if (inputArray1[i] != inputArray2[i]) {
                    return false;
                }

            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //System.out.println(approach1(new int[]{1, 2, 5, 7, 8, 3, 10}, new int[]{1, 2, 5, 7, 8, 3, 10}));

        System.out.println(approach2(new int[]{1, 2, 5, 7, 8, 3, 10}, new int[]{1, 2, 5, 7, 8, 3, 10}));


    }
}
