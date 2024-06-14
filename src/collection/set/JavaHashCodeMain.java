package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 HashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        //Object에서 제공하는 hashCode => 객체의 참조값을 hashCode로 사용
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //Object에서 제공하는 hashCode를 16진수로 바꿔서 출력함
        System.out.println(Integer.toHexString(obj1.hashCode()));   //객체의 해쉬코드(참조값)
        System.out.println("obj1 = " + obj1);

        //자바는 각 클래스마다 hashCode를 이미 오버라이딩 해둠.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());    //해시충돌을 방지하기 위해 추가적으로 기능이 더해짐.

        //hashCode는 정수를 반환하기 때문에 마이너스 값이 들어올 수 있음.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까? 인스턴스는 다르지만, equals는 같다.
        //member1과 member2는 물리적으로 다른 메모리에 있는 객체이지만, 논리적으로는 같다고 표현할 수 있음. => 동일성은 다르지만 동등성은 같음.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //동일성과 동등성
        //오버라이딩 하지 않은 경우 Object가 기본으로 제공하는 hashCode와 equals를 사용하게 되므로, 같은 메모리 상에 있지 않으면 false를 반환
        System.out.println("member1 == member2 = " + (member1 == member2));  //동일성
        //equals 메서드
        //오버라이드 하지 않은 경우 => 객체의 진짜 주소값을 비교함으로 false,
        //오버라이드 한 경우 => 객체의 필드값으로 비교함으로 필드 값이 같다면 true
        System.out.println("member1.equals(member2) = " + (member1.equals(member2)));    //동등성 => id 값이 같기 때문에 true

        System.out.println(member1);
        System.out.println(member2);
        //오버라이딩 한 경우 member1과 member2의 id의 해시코드 값을 가져오기 때문에 hashCode() 값은 같다.
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

        //객체의 진짜 주소값
        System.out.println("System.identityHashCode(member1) = " + System.identityHashCode(member1));
        System.out.println("System.identityHashCode(member2) = " + System.identityHashCode(member2));

//        String a1 = "a";
//        String a2 = "a";
//
//        System.out.println("(a == b) = " + (a1 == a2));
//        System.out.println("a1.equals(a2) = " + (a1.equals(a2)));
    }
}
