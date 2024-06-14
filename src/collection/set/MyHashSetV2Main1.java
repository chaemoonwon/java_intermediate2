package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);


        //String에서 재정의한 hashCode가 호출됨.
        System.out.println("A.hashCode() = " + "A".hashCode());
        System.out.println("B.hashCode() = " + "B".hashCode());
        System.out.println("AB.hashCode() = " + "AB".hashCode());
        System.out.println("SET.hashCode() = " + "SET".hashCode());

//        System.out.println("System.identityHashCode(\"A\") = " + System.identityHashCode("A"));
//        System.out.println("System.identityHashCode(\"B\") = " + System.identityHashCode("B"));
//        System.out.println("System.identityHashCode(\"SET\") = " + System.identityHashCode("SET"));

        //검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
