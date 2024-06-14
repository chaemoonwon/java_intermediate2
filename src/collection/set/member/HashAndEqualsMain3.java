package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        Member serachValue = new Member("A");
        System.out.println("System.identityHashCode(serachValue) = " + System.identityHashCode(serachValue));
        System.out.println("serachValue.hashCode() = " + serachValue.hashCode());

        boolean contains = set.contains(serachValue);
        System.out.println("contains = " + contains);
    }
}
