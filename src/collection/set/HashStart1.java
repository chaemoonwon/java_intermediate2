package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        //입력: 1,2,5,8
        //결과: [1,2,5,8]
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //배열에서 특정 값 찾기 => O(n)으로 성능이 매우 느림
        int searchValue = 8;
        //4번 반복 O(n)
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }

        }
    }
}
