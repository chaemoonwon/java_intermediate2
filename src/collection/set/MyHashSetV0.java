package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    
    private int[] elementData = new int[10];
    private int size = 0;

    // 데이터 저장
    // 중복된 값이 있으면 false, 없으면 true를 반환
    // O(n)
    public boolean add(int value) {
        //데이터 검색
        if (contains(value)) {
            return false;
        }
        //데이터 저장
        elementData[size] = value;
        size++;
        return true;
    }

    // 중복된 값이 있는지 확인하는 메서드
    // O(n)
    public boolean contains(int value) {
        //데이터를 검색해서 중복된 값이 있는지 확인하는 로직
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
