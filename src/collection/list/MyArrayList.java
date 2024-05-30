package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    // 타입을 String으로 추가했을 경우 제네릭을 사용하게 되면,
    // 입력받을 수 있는 타입이 정해져 있는 경우에 컴파일 오류를 확인할 수 없으므로, 런타임 시에 예외가 발생됨.
//    public void addBad(String s) {
//        elementData[size] = s;
//        size++;
//    }

    @Override
    public void add(E e) {
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
    public void add(int index, E e) {
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
    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;       //값을 교체
        return oldValue;        //기존의 값 반환
    }

    //코드 추가
    //데이터 삭제
    @Override
    public E remove(int index) {
        //해당 인덱스 위치의 값을 꺼내기
        E oldValue = get(index);
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
    @Override
    public int indexOf(E e) {
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
