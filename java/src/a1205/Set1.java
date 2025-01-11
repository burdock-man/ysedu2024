package a1205;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 자바 컬렉션
// 다수의 데이터를 쉽고 효과적으로 처리
// List

public class Set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");

        System.out.println();
        for(String e : set) {
            System.out.println(e);
        }

        // 데이터삭제
        set.remove("apple");

        System.out.println();
        for(String e : set) {
            System.out.println(e);
        }

        set.add("orange");
        set.add("orange"); // 중복요소는 저장이 안됨.
        set.add("tomato");

        System.out.println();
        for(String e : set) {
            System.out.println(e);
        }

        Iterator<String> iterSet = set.iterator();

        System.out.println();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next() + " ");
        }

        System.out.println();
        System.out.println(set); // [배열]

        System.out.println();
        System.out.println(set.contains("orange")); // true

        set.clear(); // 전체 데이터 삭제
        System.out.println();
        System.out.println(set); // []

        System.out.println();
        System.out.println(set.isEmpty()); // true

    }
}
