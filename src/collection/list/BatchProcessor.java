package collection.list;

public class BatchProcessor {
    //컴파일 시점에는 MyList 인터페이스에 의존하고, 런타임 시점에는 의존관계 주입을 통해
    //MyList의 구현체를 주입 받아 사용할 수 있게 됨.
    private final MyList<Integer> list; //x001(new MyArrayList<>()); => 런타임 시점

    //MyList - MyArrayList
    //MyList - MyLinkedList
    public BatchProcessor(MyList<Integer> list) {
//        this.list = x001(new MyArrayList<>());    //의존관계 주입
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {    //0(n)
            list.add(0, i); //앞에 추가 => MyArrayList : 0(n), MyLinkedList : 0(1)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
