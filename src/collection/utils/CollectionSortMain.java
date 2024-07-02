package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {
    public static void main(String[] args) {
        //컬렉션을 편리하게 다룰 수 있는 기능
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);
        Collections.shuffle(list);  //랜덤으로 숫자 정렬
        System.out.println("shuffle list = " + list);

        Collections.sort(list); //정렬 기준 대로 정렬
        System.out.println("sort list = " + list);
        Collections.reverse(list);  //정렬 기준 반대로 정렬
        System.out.println("reverse list = " + list);


    }
}
