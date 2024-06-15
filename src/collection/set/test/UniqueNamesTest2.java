package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        //배열을 List로 변환
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

//        for (Integer s : inputArr) {
//            set.add(s);
//        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
