package Questions;

import java.io.*;
import java.util.Scanner;

public class Question_26_DataRead {

    /*
    Write a java program to read from a .txt file
     */

    public static void approach1(String filePath) {

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.lines().forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void approach2(String filePath) {


        File fileRef = new File(filePath);
        try {
            Scanner sc = new Scanner(fileRef);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {

        //approach1("D:\\Data\\Download\\Makoto Shinkai.txt");

        approach2("D:\\Data\\Download\\Makoto Shinkai.txt");

    }
}
