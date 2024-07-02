package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
//        list.add(1);  //값을 변경하거나 추가하는 것은 불가능함
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " +list.getClass());   //값을 변경할 수 없는 구현체 ImmutableCollections가 사용됨.

        //예외 발생
        //java.lang.UnsupportedOperationException
//        list.add(1);
    }
}
