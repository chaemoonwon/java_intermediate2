package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        //성능 비교
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size);    //첫번째 위치 찾는데 0(1), 데이터 추가(이동) 0(n)
        addMid(new ArrayList<>(), size);     //중간 위치 찾는데 0(1), 데이터 추가(이동) 0(n)

        ArrayList<Integer> arrayList = new ArrayList<>();   //조회용 데이터로 사용
        addLast(arrayList, size);    //맨 뒤 위치 찾는데 0(1), 데이터 추가 0(1)

        int loop = 10000;
        System.out.println("==ArrayList 조회==");
        //arrayList는 어느 위치에 있던지 바로 조회됨.
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("==ArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size - 1);

        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);   //찾는데 0(1), 데이터 추가 0(1)
        addMid(new LinkedList<>(), size);     //찾는데 0(n), 데이터 추가 0(1)

        LinkedList<Integer> linkedList = new LinkedList<>();    //조회용 데이터로 사용
        addLast(linkedList, size);    //찾는데 0(n), 데이터 추가 0(1)

        System.out.println("==LinkedList 조회==");
        //linkedList는 위치가 멀면 멀수록 조회하는데 시간이 걸림.
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("==LinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size - 1);

    }

    //앞에 데이터 추가
    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //중간에 데이터 추가
    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);    //중간 위치 검색
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //뒤에 데이터 추가
    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //해당 index까지 조회 => 해당 인덱스의 위치를 조회
    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //해당 인덱스의 값을 조회 => 해당 인덱스 위치에 있는 값을 조회
    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
