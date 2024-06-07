package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    //해시 충돌이 발생할 확률은 CAPACITY의 크기에 따라 달라짐.
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99 ,9}
        //CAPACITY의 크기가 입력된 데이터의 수보다 작은 경우 해시 충돌이 발생함.
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];   //LinkedList의 자료구조를 이용한 배열 => 배열 안에 여러 개의 값이 들어갈 수 있어야 하므로
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();    //배열 안에 LikedList의 자료구조를 생성 => 충돌이 일어날 확률이 적음
        }

        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);    //중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contain(buckets, searchValue);
        System.out.println("buckets.contains(" +searchValue+ ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)
        //set은 중복된 값을 저장하지 않음.
        if (!bucket.contains(value)) {  //해당 해시 인덱스의 중복된 데이터 값이 있는지 체크 O(n)
            bucket.add(value);
        }
    }

    //찾는 데이터 값이 있는지 확인하는 검색 기능
    //해시 충돌이 발생할 경우 성능은 O(n), 발생하지 않으면 O(1)
    private static boolean contain(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)
        return bucket.contains(searchValue);    //찾는 값이 중복된 값이면 true, 그렇지 않으면 false를 반환

//        for (Integer integer : bucket) {
//            if (integer == searchValue) {
//                return true;
//            }
//            return false;
//        }
    }

    // 해시 인덱스 구하기
    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    //정리
    //해시 인덱스를 사용하는 방식에서
    //해시 충돌을 방지하기 위해서 CAPACITY의 크기를 적절하게 잡는 것이 중요함.
}
