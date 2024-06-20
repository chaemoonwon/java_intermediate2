package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        HashSet<Integer> addSet = new HashSet<>(set1);
        addSet.addAll(set2);
        System.out.println("합집합: " + addSet);

        HashSet<Integer> comSet = new HashSet<>(set1);
        comSet.retainAll(set2);
        System.out.println("교집합: " + comSet);

        HashSet<Integer> removeSet = new HashSet<>(set1);
        removeSet.removeAll(set2);
        System.out.println("차집합: " + removeSet);

//        Iterator<Integer> iterator = set1.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//        for (Integer s : set2) {
//            if (set2.contains(set1.)) {
//                set2.add(s);
//            }
//        }
//        System.out.println("교집합: " + set2);
    }
}
