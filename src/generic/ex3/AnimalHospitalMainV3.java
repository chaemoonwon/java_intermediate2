package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integerHospital;    //Animal과 관련없는 타입 인자를 컴파일 시점에 막음.

        Dog dog = new Dog("강아지1", 100);
        Cat cat = new Cat("고양이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1 : 개 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력 => 컴파일 오류

        //문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog dog1 = dogHospital.bigger(new Dog("강아지2", 200));
        System.out.println("dog1 = " + dog1);
    }
}
