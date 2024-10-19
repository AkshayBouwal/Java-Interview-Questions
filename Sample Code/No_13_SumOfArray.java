package Questions;

public class No_13_SumOfArray {

    /*
    Write a java program to find the sum of element in the array
     */

    public static void approach1(int[] input) {

        int sum = 0;

        for (int element : input) {
            sum = sum + element;
        }

        System.out.println(sum);


    }

    public static void approach2(int[] input) {

        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }

        System.out.println(sum);
        
    }

    public static void main(String[] args) {

        approach2(new int[]{1, 2, 5, 7, 8, 3,10});


    }
}
