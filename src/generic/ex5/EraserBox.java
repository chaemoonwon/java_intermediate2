package generic.ex5;

public class EraserBox<T> {

    // 자바는 컴파일 이후에 제네릭 정보를 지우기 때문에
    // T의 타입이 항상 Object가 되는 문제가 발생하므로 컴파일 오류
    public boolean instanceCheck(Object param) {
//        return param instanceof T;
        return false;
    }

    // new T()를 한 경우도 마찬가지로 항상 new Object가 되므로 컴파일 오류
    public void create() {
//        return new T();   //오류
    }
}
