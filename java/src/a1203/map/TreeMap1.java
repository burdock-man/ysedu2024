package a1203.map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();

        //put() 메소드를 이용한 요소의 저장
        tm.put(30,"삼십");
        tm.put(10,"십");
        tm.put(40,"사십");
        tm.put(20,"이십");

        System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
        // 출력 => 맵에 저장된 키들의 집합 : [10, 20, 30, 40]
        // TreeMap은 키를 자연 순서(알파벳,숫자)로 정렬하여 출력 ㅋㅋ!

        for(Integer key : tm.keySet()) {
            System.out.println(String.format("키 : %s || 값 : %s", key, tm.get(key)));
        }

        TreeMap<String,Integer> tm1 = new TreeMap<>();

        //put() 메소드를 이용한 요소의 저장
        tm1.put("ㄷㄷ", 30);
        tm1.put("ㄱㄱ", 10);
        tm1.put("ㅇㅇ", 40);
        tm1.put("ㅂㅂ", 20);

        System.out.println("맵에 저장된 키들의 집합 : " + tm1.keySet());

        for(String key : tm1.keySet()) {
            System.out.println(String.format("키 : %s || 값 : %s", key, tm.get(key)));
        }

    }
}
