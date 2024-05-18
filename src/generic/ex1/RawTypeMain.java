package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();   //Raw 타입
//        GenericBox<Integer> integerBox = new GenericBox<>();   // 권장
        // 매개변수 타입을 지정해주지 않을 경우 Object로 설정됨.
        integerBox.set(10);
        Object object = integerBox.get();
        System.out.println("object = " + object);

        //Raw타입은 사용하지 않는 것이 좋음.
    }
}
