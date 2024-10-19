package Questions;

import java.util.Arrays;

public class No_17_Max_Min_InArray {

    /*
    Write a program to find Maximum and Minimum element in the Array
     */

    public static void approach1(int[] input) {


        int max = input[0];
        int min = input[0];

        for (int i = 1; i < input.length; i++) {

            if (max < input[i]) {
                max = input[i];
            }

        }

        System.out.println("Maximum : " + max);

        for (int i = 1; i < input.length; i++) {

            if (min > input[i]) {
                min = input[i];
            }

        }

        System.out.println("Minimum : " + min);


    }

    public static void approach2(int[] input) {

        Arrays.sort(input);
        System.out.println("Maximum : " + input[input.length - 1]);
        System.out.println("Minimum : " + input[0]);


    }

    public static void main(String[] args) {

        //approach1(new int[]{100, 2000, 5, 700, 8, 3, 10, 89});

        approach2(new int[]{100, 200, 5, 700, 8, 13, 10, 89});


    }
}
