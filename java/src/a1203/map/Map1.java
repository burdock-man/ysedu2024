package a1203.map;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); // <String, Integer> 이거 생략해서 <>로 가능.
        // ArrayList는 .add()를 쓴다면, HashMap은 .put()을 쓴다!

        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        System.out.println("\n맵에 저장된 키들의 집합 : " + hm.keySet());

        // 출력 => 맵에 저장된 키들의 집합 : [이십, 삼십, 사십, 십]
        // 출력이 내가 저장한 순서대로 안되고, 지 조옷대로 나온다. 내가 키를 입력해야 함.


        for(String key : hm.keySet()) {
            System.out.println(String.format("키 : %s | 값 : %s", key, hm.get(key)));
        }

        // 키 - 값 쌍으로 데이터 저장
        // 각 데이터는 고유한 키(key)와 이에 대응하는 값(Value)로 구성.
        // 순서없음
        // 중복도 OK!


        // ===================================================================================
        // 근데 지우는건 .remove()로 ArrayList랑 똑같음 ㅋㅋ;

        hm.remove("사십");

        hm.replace("이십", 200);

        for(String key : hm.keySet()) {
            System.out.println(String.format("키 : %s | 값 : %s", key, hm.get(key)));
        }

    }
}
