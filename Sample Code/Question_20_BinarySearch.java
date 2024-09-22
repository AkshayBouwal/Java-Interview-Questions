package Questions;

import java.util.Arrays;

public class Question_20_BinarySearch {

    /*
    Write a java program to find an element in an Array using Binary Search.
     */

    public static void approach1(int[] input, int key) {

        Arrays.sort(input);

        int startIndex = 0;
        int endIndex = (input.length - 1);


        while (startIndex <= endIndex) {

            int mid = (startIndex + endIndex) / 2;


            if (input[mid] == key) {

                System.out.println("Element found at Index " + mid);
                break;

            } else if (key < input[mid]) {

                endIndex = mid - 1;

                if (endIndex == startIndex || endIndex < startIndex) {
                    System.out.println("Element Not Found");
                    break;
                }


            } else {

                startIndex = mid + 1;

                if (startIndex == endIndex || startIndex > endIndex) {
                    System.out.println("Element Not Found");
                    break;
                }

            }


        }


    }

    public static void main(String[] args) {


        //Arrays.binarySearch();

        approach1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8);
    }
}
