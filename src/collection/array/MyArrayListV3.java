package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elementData.length) {
            grow();
        }

        //데이터를 마지막에 추가
        //데이터 이동 x
        elementData[size] = e;
        size++;
    }

    //코드 추가
    //앞에 데이터를 추가
    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }
        //데이터를 오른쪽으로 이동
        shiftRightFrom(index);
        //데이터 추가
        elementData[index] = e;
        size++;
    }

    //요소의 마지막 부터 index까지 오른쪽으로 데이터 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    // 배열 크기가 size와 같다면 확장
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

    //코드 추가
    //데이터 삭제
    public Object remove(int index) {
        //해당 인덱스 위치의 값을 꺼내기
        Object oldValue = get(index);
        //데이터를 왼쪽으로 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;   //마지막 위치에 null 입력
        return oldValue;
    }

    //코드 추가
    //요소에 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i <size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
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
