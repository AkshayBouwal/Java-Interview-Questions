package Questions;

public class Question_1_LargestNum {

    /*
        You have given three numbers.
        Write a program to find out largest number among these three numbers.

      */

    public static void approach1(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }

    public static void approach2(int num1, int num2, int num3) {


        int max = num1 >= num2 ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);
        System.out.println(max);


    }

    public static void main(String[] args) {

        approach1(10,20,38);
        approach2(55,289,68);

    }
}
