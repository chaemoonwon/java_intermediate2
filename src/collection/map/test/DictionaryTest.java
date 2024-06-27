package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryTest {
    public static void main(String[] args) {
        //문제: 영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전 만들기
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            System.out.println("==단어 입력 단계==");
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String eng = sc.next();
            if (eng.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 (종료는 'q'): ");
            String kor = sc.next();

            map.put(eng, kor);
        }
        System.out.println("==단어 검색 단계==");
//        Set<String> keySet = map.keySet();
        while (true) {
//            for (String key : keySet) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String key = sc.next();
            if (key.equals("q")) {
                break;
            }
            if (!map.containsKey(key)) {
                System.out.println(key + "은(는) 사전에 없는 단어입니다.");
                continue;
            }
            String kor = map.get(key);
            System.out.println(key + "의 뜻: " + kor);
        }
    }
}
