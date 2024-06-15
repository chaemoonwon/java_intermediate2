package collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>();

        for (Integer s : inputArr) {
            set.add(s);
        }

        for (Integer s : set) {
            System.out.println(s);
        }


    }
}
