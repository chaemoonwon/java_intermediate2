package collection.map.test;

import java.util.*;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {

        //문제 : map1과 map2에 공통으로 들어있는 키를 찾고, 그 값의 합 구하기
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        System.out.println(map1);
        System.out.println(map2);

        //map1과 map2 공통의 합을 넣는 HashMap 생성
        HashMap<String, Integer> com = new HashMap<>();

        //map1과 map2의 키 값 구하기
        Set<String> mapSet1 = map1.keySet();
        Set<String> mapSet2 = map2.keySet();
        //구한 key값의 교집합 구하기
        mapSet1.retainAll(mapSet2);
        System.out.println(map1);
        for (String key : mapSet1) {
            //mqp1과 map2의 key의 value 값 꺼내기
            Integer m1Value = map1.get(key);
            Integer m2Value = map2.get(key);
            //누적합 구하기
            m1Value += m2Value;
            System.out.println("m1Value = " + m1Value);
            //공통 key값과 누적합을 생성한 com에 넣기
            com.put(key, m1Value);
        }
        System.out.println(com);

        // 문제 풀이(정답지)
        // 1.
//        for (String key : map1.keySet()) {
//            if (map2.containsKey(key)) {
//                com.put(key, map1.get(key) + map2.get(key));
//            }
//        }
//
//        System.out.println(com);

    }
}
