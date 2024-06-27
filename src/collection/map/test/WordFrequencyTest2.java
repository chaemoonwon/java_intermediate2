package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        //문제 : 각각의 같은 단어가 나타난 수 구하기.
        String text = "orange banana apple apple banana apple";
//        int orangeNum = 0;
//        int bananaNum = 0;
//        int appleNum = 0;

        //String 분할
        String[] words = text.split(" ");
//        for (String s : words) {
////            System.out.println(s);
//            if (s.equals("orange")) {
//                orangeNum++;
//            } else if (s.equals("banana")) {
//                bananaNum++;
//            } else {
//                appleNum++;
//            }
//        }

        //각각의 단어를 key값으로 map 생성.
        Map<String, Integer> map = new HashMap<>();
//        map.put("orange", orangeNum);
//        map.put("banana", bananaNum);
//        map.put("apple", appleNum);
//        System.out.println(map);

        // 문제 풀이(정답지)
        for (String word : words) {
//            Integer count = map.get(word);
//            if (count == null) {
//                count = 0;
//            }
//            count++;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
