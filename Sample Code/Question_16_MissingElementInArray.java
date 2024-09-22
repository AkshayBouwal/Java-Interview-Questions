package Questions;

public class Question_16_MissingElementInArray {

    /*

    Write a program to find missing element in the Array.

    Prerequisite:
    #Array should be in A.P form
    #Need to be sorted
    #No duplicate element
    #Range should be defined i.e. First and Last Element should be known

     */

    public static void approach1(int[] inputArray) {

        int inputSum = 0;

        for (int element : inputArray) {
            inputSum = inputSum + element;
        }

        /*
        Sn = (n * (2a + (n-1)d))/2
        or
        Sn (n*(First Element + Last Element))/2
         */

        int rangeSum = ((inputArray.length + 1) * (inputArray[0] + inputArray[inputArray.length - 1])) / 2;

        System.out.println("Missing Element : " + (rangeSum - inputSum));


    }

    public static void main(String[] args) {

        approach1(new int[]{1, 2, 3, 4, 6});


    }
}
