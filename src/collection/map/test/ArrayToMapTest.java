package collection.map.test;

import java.util.*;

public class ArrayToMapTest {
    public static void main(String[] args) {
        //2차원 배열의 데이터를 Map<String, Integer>로 변경
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        //나 스스로 문제 풀이
        //주어진 배열로부터 Map 생성
        Map<String, Integer> productMap = new HashMap<>();

//        productMap.put(productArr[0][0], Integer.valueOf(productArr[0][1]));
//        productMap.put(productArr[1][0], Integer.valueOf(productArr[1][1]));
//        productMap.put(productArr[2][0], Integer.valueOf(productArr[2][1]));
        for (String[] s : productArr) {
            productMap.put(s[0], Integer.valueOf(s[1]));
        }

        //Map의 모든 데이터 출력
        for (Map.Entry<String, Integer> en : productMap.entrySet()) {
                System.out.println("제품: " + en.getKey() + ", 가격: " + en.getValue());
        }

        // 문제 풀이(정답지)
        
    }
}
