package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //StringBox와 IntegerBox모두 같은 코드로써 코드가 중복될 수는 있지만,
        //integerBox, StringBox에 해당 다입이 아닌 다른 타입이 입력될 경우 컴파일 오류가 발생함 => 타입 안정성이 높음
    }
}
