package Questions;

public class Question_5_ReverseAString {

    /*
    Write a program to reverse a string.
     */

    public static void approach1(String inputString) {

        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }


    }

    public static void approach2(String inputString) {

        String reverse = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.print(reverse);


    }

    public static void approach3(String inputString) {

        String reverse = "";

        char[] array = inputString.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            reverse = reverse + array[i];
        }

        System.out.print(reverse);


    }

    public static void approach4(String inputString) {

        StringBuffer sb = new StringBuffer(inputString);
        System.out.println(sb.reverse());


    }

    public static void approach5(String inputString) {

        StringBuilder sb = new StringBuilder(inputString);
        System.out.println(sb.reverse());


    }


    public static void main(String[] args) {

        //approach1("Writing objects: 100% (5/5), 1.22 KiB | 627.00 KiB/s, done.");
        //approach3("Writing objects: 100% (5/5), 1.22 KiB | 627.00 KiB/s, done.");
        approach4("Writing objects: 100% (5/5), 1.22 KiB | 627.00 KiB/s, done.");
        approach5("Writing objects: 100% (5/5), 1.22 KiB | 627.00 KiB/s, done.");


    }
}
