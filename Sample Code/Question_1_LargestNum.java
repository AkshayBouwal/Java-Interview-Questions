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

    public static void approach3(int num1, int num2, int num3) {

        /*
        Test Boundary Conditions 10,10, 9 or 10,9,10 or 9,10,10
         */

        if (num1 > num2 && num1 > num3) {
            System.out.println("First Number " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second Number " + num2);
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All Numbers are equal");
        } else {
            System.out.println("Third Number " + num3);
        }

    }

    public static void main(String[] args) {

//        approach1(10, 20, 38);
//        approach2(55, 289, 68);

//        approach1(55, 75, 34);
//        approach3(55, 75, 34);


//        approach1(10, 10, 10);
        approach3(10, 10, 9);

    }
}
