package Questions;

import java.util.*;
import java.util.stream.Collectors;

public class No_28_DuplicateNumber {

    public static void approach1() {

        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        Set<Integer> duplicateValues = list.stream().filter(integer -> Collections.frequency(list, integer) > 1).collect(Collectors.toSet());

        System.out.println(duplicateValues);
    }

    public static void approach2() {

        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        Set<Integer> duplicateNum = new HashSet<>();

        Set<Integer> duplicateValues = list.stream().filter(integer -> !duplicateNum.add(integer)).collect(Collectors.toSet());

        System.out.println(duplicateValues);
    }

    public static void main(String[] args) {

        approach1();
        approach2();


    }
}
