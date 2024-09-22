package Questions;

public class Question_6_PalindromeString {

    /*

    # Write a program to check given String is Palindrome or not.
    # A palindrome string is a string that reads the same forward and backward.
    # For example, the string "level" is a palindrome because it remains the same when read from beginning to end and vice versa

     */

    public static void approach1(String inputString) {

        String reverse = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse = reverse + inputString.charAt(i);
        }

        if (reverse.equals(inputString)) {
            System.out.println("Yes, String is Palindrome.");
        } else {
            System.out.println("No, String is not Palindrome");
        }

    }

    public static void main(String[] args) {

        approach1("level");
        approach1("Akshay");


    }
}
