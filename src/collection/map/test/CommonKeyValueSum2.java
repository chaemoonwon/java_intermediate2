package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {

        //문제 : map1과 map2에 공통으로 들어있는 키를 찾고, 그 값의 합 구하기
        Map<String, Integer> map1 = Map.of("A",1,"B",2,"C",3);
        Map<String, Integer> map2 = Map.of("B",4,"C",5,"D",6);

        System.out.println(map1);
        System.out.println(map2);

        //map1과 map2 공통의 합을 넣는 HashMap 생성
        HashMap<String, Integer> com = new HashMap<>();

        //문제 상황
        //Map.of는 new ImmutableCollections.MapN<>(k1, v1, k2, v2, k3, v3) 를 반환하므로 변경할 수 없음
        //그런데 retainAll()을 사용할 경우 구한 key 값이 변경되는 위험이 있으므로 런타임 시 UnsupportedOperationException 예외가 발생함.

        // 사용 불가
        //map1과 map2의 키 값 구하기
//        Set<String> mapSet1 = map1.keySet();
//        Set<String> mapSet2 = map2.keySet();
//        //구한 key값의 교집합 구하기
//        mapSet1.retainAll(mapSet2);
//        System.out.println(mapSet1);
//        for (String key : mapSet1) {
//            //mqp1과 map2의 key의 value 값 꺼내기
//            Integer m1Value = map1.get(key);
//            Integer m2Value = map2.get(key);
//            //누적합 구하기
//            m1Value += m2Value;
//            System.out.println("m1Value = " + m1Value);
//            //공통 key값과 누적합을 생성한 com에 넣기
//            com.put(key, m1Value);
//        }
//        System.out.println(com);

        //해결책
        //map1의 key를 기준으로 map2의 공통된 키가 있는 지 확인하고, put을 통해 공통 키와 값을 입력하는 방식을 사용해야 함.
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                com.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(com);

    }
}
