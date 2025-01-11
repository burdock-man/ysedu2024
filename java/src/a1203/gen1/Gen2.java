package a1203.gen1;

import java.util.ArrayList;

public class Gen2 {
    public static void main(String[] args) {
        ArrayList<Integer> piches = new ArrayList<>(); // 컬렉션

        // 제네릭<>을 사용하지 않으면 ArrayList에 추가하는 객체는
        // Object 자료형 - 모든 객체가 상속하고 있는 가장 기본적인 자료형
        // 자료를 넣을때는 문제가 없지만 값을 가져올때는
        // Object 자료형에서 String 자료형으로 형변환 해야한다.


        piches.add(1);
        piches.add(2);
        piches.add(3);
        piches.add(4);
        piches.add(5);
        piches.add(6);

        for (int i : piches) {
            System.out.println(">>>> " + piches.get(i-1));
        }
    }
}
