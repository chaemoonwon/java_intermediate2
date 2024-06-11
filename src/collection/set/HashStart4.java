package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1,2,5,8,14,99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(1) = " + hashIndex(2));
        System.out.println("hashIndex(1) = " + hashIndex(5));
        System.out.println("hashIndex(1) = " + hashIndex(8));
        System.out.println("hashIndex(1) = " + hashIndex(14));
        System.out.println("hashIndex(1) = " + hashIndex(99));

        //해시 인덱스를 활용한 배열에 입력 값을 저장
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));


        //저장한 입력 값을 조회
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue); // => 입력 값을 활용
        System.out.println("searchValue의 hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex]; //O(1)
        System.out.println(result);

    }

    // hashIndex의 데이터 값에 입력 값을 저장
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);   //입력 값을 통해 구한 해시 인덱스의 값
        inputArray[hashIndex] = value;     //입력 값을 해시 인덱스에 대입
    }

    // 해시 인덱스 구하기
    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    //정리
    //해시 인덱스를 통해서 입력 값이 클 경우에 해당 데이터 값을 인덱스를 통해서 구할 수 있었지만,
    //나머지 연산을 통해 인덱스 값이 동일하지만 입력되는 데이터 값이 다를 경우 해시가 충돌할 수 있는 한계가 있음.
}
