package generic.ex4;

public class GenericMethod {

    //Object 반환 메서드(일반 메서드)
    public static Object objMethod(Object obj) {
        System.out.println("Object obj = " + obj);
        return obj;
    }

    //제네릭 타입 반환 메서드(제네릭 메서드) => 메서드 안에서만 제네릭 사용 가능.
    public static <T> T genericMethod(T t) {
        System.out.println("generic print = " + t);
        return t;
    }

    //제네릭 타입 제한 메서드 => 타입 매개변수 제한
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }

}
