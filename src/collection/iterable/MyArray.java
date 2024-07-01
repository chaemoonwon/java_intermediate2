package collection.iterable;

import java.util.Iterator;

//Iterable을 통해 Iterator를 순회의 대상으로 하는 자료구조를 만듬
public class MyArray implements Iterable<Integer>{
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    //반복가능하다
    //반복자를 반환 => 내부 배열인 numbers를 참조
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
