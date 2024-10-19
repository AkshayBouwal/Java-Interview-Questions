package Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class No_29_SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 50, 19, 3,100);

//        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(sortedList);

        int secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);


    }
}
