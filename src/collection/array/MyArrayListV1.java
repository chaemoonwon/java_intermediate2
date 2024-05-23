package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;       //데이터를 입력할 때마다 값이 증가

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    //값을 조회
    public Object get(int index) {
        return elementData[index];
    }

    //배열의 특정 위치에 값을 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;       //값을 교체
        return oldValue;        //기존의 값 반환
    }

    // 인덱스 조회
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        //[1,2,3,null,null] //size=3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
        //[1,2,3]   // size=3
    }
}
