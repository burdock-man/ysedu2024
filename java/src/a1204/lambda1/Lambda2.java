package a1204.lambda1;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "orange");


        // 이름을 기준으로 내림차순 정렬
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("내림차순 정렬" + names);
        // 이름을 기준으로 내림차순 정렬
        names.sort(String::compareTo);
        System.out.println("오름차순 정렬" + names);
    }
}
