package generic.ex1;

//제네릭을 사용해서
//BoxMain1,BoxMain2의 타입 안정성과 코드 중복 문제를 해결할 수 있음
//T : 타입 매개변수
public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
