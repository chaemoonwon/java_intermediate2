package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {

        run(new HashMap<>());   //무작위 순서
        run(new LinkedHashMap<>()); //키를 기준으로 입력한 순서 정렬
        run(new TreeMap<>());   //키 자체의 데이터(값)를 기준으로 순서 정렬
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("D", 40);
        map.put("I", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }
}
