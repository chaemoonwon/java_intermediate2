package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        //입력: {1, 2, 5, 8, 14, 99}
        //결과: [null, 1, 2, null, null, 5, null, null, 8, null, ~, 14, ~, 99]
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));


        int searchValue = 99;
        Integer result = inputArray[searchValue];  //O(1)
        System.out.println("result = " + result);

        //정리
        // 해당 데이터의 값을 찾기 위해서 해당 데이터의 값 만큼의 배열의 크기만큼 생성해주는 것은
        // 메모리 공간이 낭비되는 문제가 발생

    }
}
