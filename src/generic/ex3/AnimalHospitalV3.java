package generic.ex3;

import generic.animal.Animal;
import generic.animal.Dog;

//타입 매개변수 제한
//<T extends Animal>
//T의 타입을 Animal클래스와 자식 클래스로 제한해서 사용할 수 있음.
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
