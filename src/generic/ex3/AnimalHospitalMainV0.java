package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("강아지1", 100);
        Cat cat = new Cat("고양이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1 : 개 병원에 고양이 전달
//        dogHospital.set(cat); //컴파일 에러 => 다른 타입을 입력하면 컴파일 오류 발생

        //문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("강아지2", 200));
        System.out.println("bigger = " + bigger);

    }
}
