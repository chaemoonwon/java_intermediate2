package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 HashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
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
        //equals, hashCode를 오버라이딩 하지 않은 경우
        System.out.println("member1 == member2 = " +(member1 == member2));  //동일성
        System.out.println("member1.equals(member2) = " +(member1.equals(member2)));    //동등성

        //오버라이딩 한 경우 member1과 member2의 hashCode() 값은 같다.
        System.out.println("member1.hashCode() = " +member1.hashCode());
        System.out.println("member2.hashCode() = " +member2.hashCode());
    }
}
