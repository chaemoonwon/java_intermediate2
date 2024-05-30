package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        //성능 비교
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size);    //찾는데 0(1), 데이터 추가(이동) 0(n)
        addMid(new MyArrayList<>(), size);     //찾는데 0(1), 데이터 추가(이동) 0(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>();   //조회용 데이터로 사용
        addLast(arrayList, size);    //찾는데 0(1), 데이터 추가 0(1)

        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        //arrayList는 어느 위치에 있던지 바로 조회됨.
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size - 1);

        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size);   //찾는데 0(n), 데이터 추가 0(1)
        addMid(new MyLinkedList<>(), size);     //찾는데 0(n), 데이터 추가 0(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();    //조회용 데이터로 사용
        addLast(linkedList, size);    //찾는데 0(n), 데이터 추가 0(1)

        System.out.println("==MyLinkedList 조회==");
        //linkedList는 위치가 멀면 멀수록 조회하는데 시간이 걸림.
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size - 1);

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //해당 index까지 조회
    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //해당 인덱스의 값을 조회
    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
