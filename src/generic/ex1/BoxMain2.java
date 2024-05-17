package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        //1)
        Object object = integerBox.get();
        Integer integer = (Integer) object; //integer로 다운 캐스팅
        System.out.println("integer = " + integer);

        //2)
        Integer integer2 = (Integer) integerBox.get();
        System.out.println("integer2 = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();  //string으로 다운 캐스팅
        System.out.println("str = " + str);

        //문제1 : 잘못된 타입의 인수 전달시 => 타입 안정성 문제 발생
//        integerBox.set("문자100");
//        Integer integer1 = (Integer) integerBox.get();      // string -> integer로 타입 에러
//        System.out.println("integer1 = " + integer1);

        //Object 최상위 클래스를 이용해서 모든 타입을 받을 수 있으므로 코드가 중복되지는 않지만,
        //모든 타입을 받으므로 StringBox, IntegerBox에 해당 타입이 아닌 다른 타입을 컴파일러가 체크하지 못함 => 런타임 시에 오류 발생
        //=> 타입이 안전하지 않음.
    }
}
