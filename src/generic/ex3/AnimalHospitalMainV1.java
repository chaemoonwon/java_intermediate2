package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("강아지1", 100);
        Cat cat = new Cat("고양이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //AnimalHospital 타입으로 개와 고양이 모두 매개변수로 전달할 경우의 문제점
        //문제1 : 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패 => 컴파일 오류가 발생하지 않음.

        //문제2 : 개 타입 반환 => 다운 캐스팅을 해야 함. / cast 오류 발생
        //
        dogHospital.set(dog);
//        dogHospital.set(cat); // ClassCastException 오류 발생
        Dog dog1 = (Dog) dogHospital.bigger(new Dog("강아지2", 200));
        System.out.println("dog1 = " + dog1);

    }
}
