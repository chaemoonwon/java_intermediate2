package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
//        T t = box.get();      //T의 타입을 반환
        System.out.println("T = " + box.get());
    }

    //출력
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();        //Box<T>의 box를 가져올 수 있음
        System.out.println("이름 = " + t.getName());
    }

    //출력하고 반환
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    //와일드 카드를 이용하면 Box<?>에 Box<Dog>, Box<Cat>, Box<Object> 등 어떠한 타입이든지 들어올 수 있음
    //?만 이용해서 모든 타입을 받을 수 있는 와일드 카드를 비제한 와일드 카드라고 함.
    static void printWildcardV1(Box<?> box) {
//        Object object = box.get();  //Object 타입을 반환
        System.out.println("? = " + box.get());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
            Animal animal = box.get();
            System.out.println("이름 = " + animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    //와일드 카드는 제네릭 메서드가 아니라 일반 메서드이다.

}
