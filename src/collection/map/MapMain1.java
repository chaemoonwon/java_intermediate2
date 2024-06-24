package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        //key - value를 모두 지정해 주어야 함.
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        studentMap.put("studentE", 90);
        //HashMap은 순서를 보장하지 않음.
        System.out.println("studentMap = " + studentMap);

        //특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        //keySet은 키 만 가져오는 기능
        System.out.println("KeySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
                Integer value = studentMap.get(key);    //key에 대한 값들을 가져올 수 있음.
                System.out.println("key = " +key + ", value = " + value);
        }

        //entry는 key와 value를 저장하는 객체
        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();    //key
            Integer value = entry.getValue();   //value
            System.out.println("key = " + key+ ", value = " +value);
        }

        //values는 값 만 가져오는 기능
        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();   //순서 x, 중복 x 이므로 단순한 값의 모음인 Collection으로 반환됨.
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

    }
}
