package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

//    public <Z> Z printAndReturn(Z z) {
//        System.out.println("animal.className: " + animal.getClass().getName());
//        System.out.println("t.className: " + z.getClass().getName());
//        return z;
//    }

    //제네릭 타입 매개변수 명과 제네릭 메서드 매개변수 명이 같을 경우
    //제네릭 타입보다 제네릭 매개변수가 높은 우선순위를 가지므로 제네릭 메서드가 적용됨.
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
    //제네릭 타입 매개변수 명과 제네릭 매개변수 명을 같게 하는 경우 모호하기 때문에
    //매개변수 타입을 다르게 해서 사용하는 것을 권장함.

}
