package a1119;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        for (int i = 0; i < week.length; i++) {
            System.out.print(week[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(week));

        // 깐츄롤 + 스페이스 누르면 포이치가 나오는데
        // 아래와 같이 작성됨. 확장 포문이라고 함 ㅇㅇ.
        // 배열 (또는 컬렉션)의 모든 요소를 순서대로 반복하는 반복문.
        for (String day : week) {
            System.out.print(day + " "); // day는 week[i] 랑 비슷함
        }
    }
}
