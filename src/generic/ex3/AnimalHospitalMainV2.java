package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

// AnimalHospitalV2<T>
// T 타입에는 어떠한 타입이든지 올 수 있기 때문에 잘못된 타입이 지정 되어도 컴파일 오류를 잡을 수 없음
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Object> ObjectHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> IntegerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
    }
}
