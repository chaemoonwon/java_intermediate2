package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        //불변 리스트를 가변 리스트로 만드는 방법
        //=> 불변 리스트에 새로 List를 만들어서 반환
        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        //가변 리스트를 불변 리스트로 만드는 방법
        //Collections.unmodifiableList(mutableList)
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());

        //java.lang.UnsupportedOperationException 예외 발생
//        unmodifiableList.add(1);

    }
}
