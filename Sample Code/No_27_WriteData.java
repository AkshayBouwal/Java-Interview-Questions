package Questions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class No_27_WriteData {

    /*
         Write a java program to write into a .txt file
     */

    public static void approach1(String filePath) {

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Selenium with Java\n");
            bufferedWriter.write("Selenium with C#\n");
            bufferedWriter.write("Selenium with Python\n");
            bufferedWriter.write("Selenium with Ruby\n");
            bufferedWriter.write("Selenium with JavaScript");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        approach1("D:\\Data\\Download\\Test.txt");


    }
}
