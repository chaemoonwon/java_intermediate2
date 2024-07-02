package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        //기본 정렬 => 비교자 x => Comparable
        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        //TreeSet은 add할 때 정렬이 됨.
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        //Id를 기준으로 정렬 => 비교자 new IdComparator() => Comparator
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);


        //정리
        /*자바는 개발자가 복잡한 정렬 알고리즘은 신경 쓰지 않으면서 정렬의 기준만 간단히 변경할 수 있도록,
        정렬의 기준을 Comparable , Comparator 인터페이스를 통해 추상화해 두었다.*/
    }
}
