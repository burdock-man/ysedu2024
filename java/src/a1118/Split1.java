package a1118;

public class Split1 {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";

        // 문자열을 배열로 분리
        String[] tokens = board.split(","); // ,를 기준으로 문자열의 방을 나눈다.
        System.out.println();
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("저자: " + tokens[3]);
        System.out.println();

        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);

        }
    }
}
