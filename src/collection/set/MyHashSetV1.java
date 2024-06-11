package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    //LinkedList를 이욯해서 buckets 배열을 생성
    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    //기본 생성자 DEFAULT_INITIAL_CAPACITY의 크기 만큼 생성
    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            //buckets 배열 안에 LinkedList를 생성
            buckets[i] = new LinkedList<>();
        }
    }

    //해시 인덱스를 사용해서 데이터를 보관함.
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)
        if (bucket.contains(value)) {   //O(n) -> 데이터가 1개~2개 들어가 있는 경우가 많음 => O(1)
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    //해시 인덱스를 사용해서 데이터를 확인함.
    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)

        return bucket.contains(searchValue);    //O(n) -> 데이터가 1개~2개 들어가 있는 경우가 많음 => O(1)
    }

    //해시 인덱스를 사용해서 데이터를 제거함.
    //bucket.remove(Integer.valueOf(value)) => 인덱스가 아닌 해당 bucket안에 있는 값을 지움.
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];    // O(1)
        boolean result = bucket.remove(Integer.valueOf(value));//래퍼 타입으로 지정함으로써 해당 인덱스에 있는 value값을 찾아서 지움
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
