
package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    //LinkedList를 이욯해서 buckets 배열을 생성
    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    //기본 생성자 DEFAULT_INITIAL_CAPACITY의 크기 만큼 생성
    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
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
    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];    //O(1)
        if (bucket.contains(value)) {   //해시 충돌할 경우 O(n) -> 데이터가 1개~2개 들어가 있는 경우가 많음 => O(1)
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    //해시 인덱스를 사용해서 데이터를 확인함.
    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<E> bucket = buckets[hashIndex];    //O(1)

        return bucket.contains(searchValue);    //해시 충돌할 경우 O(n) => 그러나 데이터가 1개~2개 들어가 있는 경우가 많음 => O(1)
    }

    //해시 인덱스를 사용해서 데이터를 제거함.
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);   // O(1)
        LinkedList<E> bucket = buckets[hashIndex];    // O(1)
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(E value) {
        //value.hashCode()는 음수가 나올 수 있음.
        // => 배열의 값으로 쓸 수 없기 때문에 절대값 공식(Math.abs())을 이용해 양수로 변환해 주어야 함.
        //절대값 => -1, -10 -> 1, 10
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
