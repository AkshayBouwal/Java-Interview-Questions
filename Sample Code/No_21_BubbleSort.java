package Questions;

import java.util.Arrays;

public class No_21_BubbleSort {

    /*
    Write a program to arrange element of an array in ascending/descending order using Bubble Sort
     */

    public static void ascending(int[] input) {

        for (int j = 0; j < input.length; j++) {

            for (int i = 0; i < input.length - 1; i++) {

                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(input));


    }

    public static void descending(int[] input) {

        for (int j = 0; j < input.length; j++) {


            for (int i = 0; i < input.length - 1; i++) {

                if (input[i] < input[i + 1]) {

                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;


                }

            }

        }

        System.out.println(Arrays.toString(input));

    }


    public static void main(String[] args) {

        //ascending(new int[]{4, 2, 1, 5, 3, 10, 8, 29});

        descending(new int[]{4, 2, 1, 5, 3, 10, 8, 29});


    }
}
