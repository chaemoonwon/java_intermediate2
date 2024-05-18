package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입은 메서드를 정의하는 시점에는 알 수 없음. => 어떤 타입이 들어올 지 알 수 없으므로
        // Object 기능만 사용 가능

//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
        animal.toString();
        animal.equals(null);
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

}
