package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        //입력: 1,2,5,8
        //결과: [null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 배열에서 특정 값 찾기
        // 인덱스와 찾는 데이터의 값을 맞춤
        // => 데이터의 값을 인덱스의 값으로 함으로써 해당 인덱스를 찾으면 데이터의 값을 바로 알 수 있으므로 O(1)의 성능을 가짐
        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);

        // 정리
        // 데이터와 인덱스의 값을 맞춤으로써 성능은 O(1)로 개선되었지만,
        // 입력 값의 범위 만큼 배열을 생성하기 때문에 메모리 공간이 낭비되는 문제가 발생함
    }
}
