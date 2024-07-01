package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[] {1,2,3,4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        //추가
        //for-each문은 배열 이거나 iterable을 구현해야지 사용할 수 있다.
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }

    }
}