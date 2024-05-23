package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //Object타입으로 타입을 입력 시,
        //기대 사항 : 숫자만 입력 허가를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자");
        System.out.println(numberList);

        //Object를 반환하므로 숫자타입으로 반환받기 위해서는 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //타입 반환 시  Object타입이므로, 컴파일 시 예외 확인 불가
        //그러나 숫자를 입력받기를 기대하므로 Integer 타입으로 다운 캐스팅을 진행하였으나 런타임 시 예외 발생
        //ClassCastException 발생. 문자를 Integer로 캐스팅
        Integer num = (Integer) numberList.get(2);


    }
}
