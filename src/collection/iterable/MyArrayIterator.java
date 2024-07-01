package collection.iterable;

import java.util.Iterator;

//Iterator는 단독으로 사용할 수 없음.
public class MyArrayIterator implements Iterator<Integer>{

    private int currentIndex = -1;
    private int[] targetArr;    // {1,2,3,4}

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        // 배열의 길이가 5(targetArr.length)
        // currentIndex가 마지막 인덱스에 오면 false를 반환
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
//        currentIndex++; //0
        return targetArr[++currentIndex];
    }
}
