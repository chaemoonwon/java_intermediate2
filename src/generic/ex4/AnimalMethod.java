package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    //static을 사용하는 이유는 제네릭 타입을 정의하지 않고 메서드를 사용하기 위해서임
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }

}
