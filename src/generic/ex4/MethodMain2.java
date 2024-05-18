package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 강아지", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);   //<Dog>로 인해 타입을 Dog타입으로 한정해서 지정해주어야 함.
//        Dog bigger = AnimalMethod.bigger(dog, targetDog);   //인자에 서로 다른 타입을 전달해주게 되면 타입 매개변수 추론으로 인해 컴파일 오류가 생김
        System.out.println("bigger = " + bigger);
    }
}
