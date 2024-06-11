package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        //모든 문자는 본인만의 고유한 숫자로 표현 가능
        System.out.println("charA = " + (int)charA);    //65
        System.out.println("charB = " + (int)charB);    //66

        //hashCode
        //ASCII 코드 표를 통해 문자를 숫자로 확인할 수 있음. => 인코딩의 개념을 알아야 함.
        //결과를 숫자로 반환(문자 -> 숫자)
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex(숫자 -> hashIndex)
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        //hashCode를 이용해서 문자를 숫자로 바꾸기
        for (char c : charArray) {
            sum = sum + (int)c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    //정리
    // hashCode는 데이터를 저장하는 값
    // hashIndex는 데이터를 저장하는 위치
    /*
    * 해쉬함수
    * 임의의 길이의 데이터를 입력으로 받아, 고정된 길이의 해시값(해시 코드)을 출력하는 함수
    * 같은 데이터를 입력 받으면 항상 같은 해쉬 코드가 출력 됨.
    * 다른 데이터를 입력 해도 같은 해쉬 코드가 출력 될 수 있음 => 해쉬 충돌 발생
    * */
}
