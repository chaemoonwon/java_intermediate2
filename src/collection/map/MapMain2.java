package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);    //같은 키에 저장시 기존 값 변경
        System.out.println(studentMap);

        //특정 학생의 키가 포함되어 있는지 확인
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 키 삭제 => 값도 함께 삭제됨.
        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}
