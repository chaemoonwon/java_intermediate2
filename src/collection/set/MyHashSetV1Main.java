package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        //생성
        MyHashSetV1 set = new MyHashSetV1(10);
        //저장
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //중복 데이터
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" +searchValue+ ") = " + result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
