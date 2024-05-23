package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    //마지막에 데이터 추가
    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }

        //데이터를 마지막에 추가
        elementData[size] = e;
        size++;
    }

    //코드 추가
    //배열 크기 확장
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;      //2배 큰 새로운 배열을 생성
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];
//
        // 새로운 배열에 기존의 값을 복사
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }
        // 새로운 배열을 참조(참조값 변경)
//        elementData = newArr;

        // Arrays.copyOf(기존배열, 새로운길이)
        // 새로운 길이로 배열을 생성하고, 기존 배열의 값을 새로운 배열에 복사한다
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    //값을 조회
    public Object get(int index) {
        return elementData[index];
    }

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
        //[1,2,3]   // size=3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}
