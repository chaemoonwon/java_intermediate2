package generic.ex1;

//제네릭
//생성 시점 T 타입에 원하는 타입 사용 가능
public class BoxMain3 {
    public static void main(String[] args) {
        //Integer
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("ㅇㄴㄻㄹ");       //Integer 타입 외에 다른 타입을 입력하는 경우 컴파일 오류 발생
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        //String
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
//        stringBox.set(123);   //컴파일 오류
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.0);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}
