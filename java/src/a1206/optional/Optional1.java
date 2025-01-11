package a1206.optional;

import java.util.Optional;

// Optional은 null 처리를 위한 도구
// null에 접근 했을때 NullPointExeption

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("\nHello");
        // 값이 반드시 있어야함.

        Optional<String> optional1 = Optional.ofNullable("\nHello"); // null값 허용
        //값이 있으면 출력
        optional.ifPresent(System.out::println);

        //값이 없으면 기본값 반환
        String value = optional.orElse("기본값출력");
        System.out.println(value);
    }
}
