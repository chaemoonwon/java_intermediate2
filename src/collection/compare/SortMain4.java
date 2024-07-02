package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        //MyUser에서 설정(age)한 기준 정렬 x
        System.out.println("Comparable 기본 정렬");
        //1. Comparable로 비교해서 정렬 => 별도의 비교자가 없으므로 객체 스스로 정렬
//        list.sort(null);
        //2.
//        Collections.sort(list);
        System.out.println(list);

        //Id 기준 정렬
        System.out.println("IdComparator 정렬");
        //1.
//        list.sort(new IdComparator());
        //2.
//        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
