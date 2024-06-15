package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>());   //hashCode 기반의 순서 정렬 => 입력한 순서를 보장하지 않음
        run(new LinkedHashSet<>()); //node를 통해 입력한 순서대로 정렬 => 입력한 순서를 보장
        run(new TreeSet<>());   //데이터 순서대로 정렬
    }


    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {    //iterator.hasNext() : 데이터가 있는지 확인
            System.out.print(iterator.next() + " ");    //iterator.next() : 다음 데이터 반환
        }

        System.out.println();
    }

    //정리
    /*
    * 실무에서는 HashSet을 가장 많이 이용하며,
    * 필요에 따라서
    * 입력 순서 유지가 필요하면 LinkedHashSet을 이용하고
    * 데이터 값 정렬이 필요하면 TreeSet을 이용함.
    * */
}
