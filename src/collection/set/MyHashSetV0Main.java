package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        //처음 데이터에 저장할 때는 O(1)의 성능, 그 이후부터는 O(n)의 성능
        set.add(1); //O(1)
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        set.add(5); //O(n)
        System.out.println(set);


        boolean result = set.add(4);    //중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);    //중복 데이터는 저장 되지 않음

        //데이터 검색
        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(99) = " + set.contains(99));

    }
}
