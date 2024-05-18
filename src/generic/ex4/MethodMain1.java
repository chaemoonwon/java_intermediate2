package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;

        Object object = GenericMethod.objMethod(i);
//        Integer result = (Integer) GenericMethod.objMethod(i);  // 다운 캐스팅 해야 함.

        // 타입 인자(Type Argument) 명시적 전달
        // Object -> Integer
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.numberMethod(20.0);

        String s = GenericMethod.<String>genericMethod("hello");
//        GenericMethod.<String>numberMethod("hello");      //타입 제한으로 인해 컴파일 오류

        //타입 추론 가능
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);



    }
}
