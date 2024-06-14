package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        //m1과 m2가 참조하는 객체가 서로 다르므로 false
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        //HashCode를 재정의 해주었으므로 m1, m2 모두 같은 해쉬인덱스에 저장되는 것을 확인할 수 있음.
        System.out.println(set);

        //검색 실패
        //contains 기능에서 equals 기능을 사용하기 때문에 false
        MemberOnlyHash serachValue = new MemberOnlyHash("A");
        System.out.println("System.identityHashCode(serachValue) = " + System.identityHashCode(serachValue));
        System.out.println("serachValue.hashCode() = " + serachValue.hashCode());

        boolean contains = set.contains(serachValue);
        System.out.println("contains = " + contains);
    }
}
