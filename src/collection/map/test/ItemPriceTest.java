package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        //문제 : 값이 1000원인 모든 상품 출력
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        ArrayList<String> list = new ArrayList<>();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value == 1000) {
                list.add(key);
            }
        }
        System.out.print(list);

        // 문제 풀이(정답지)

    }
}
