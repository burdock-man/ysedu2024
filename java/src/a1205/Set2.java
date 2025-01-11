package a1205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        // 중복된 값이 있는 리스트
        items.add("apple");
        items.add("banana");
        items.add("orange");
        items.add("apple"); // List는 중복된것도 출력됨
        items.add("grape");

        System.out.println();
        for(String e : items) {
            System.out.println(e);
        }

        // Hashset을 사용해서 중복 제거
        Set<String> uniqueItems = new HashSet<>(items);

        System.out.println();
        for(String e : items) {
            System.out.println(e);
        }


    }
}
