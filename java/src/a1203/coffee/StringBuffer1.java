package a1203.coffee;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world"); // 기존의 객체수정
        System.out.println(sb.toString()); // "Hello world"
    }
}
// 주요 차이점 요약

// 불변성 vs 가변성:
// String은 불변(immutable) 객체입니다. 문자열을 수정하면 새로운 String 객체
// StringBuffer는 가변(mutalbe) 객체입니다. 문자열을 직접 수정할 수 있습니다.

// 성능:
// 문자열을 자주 수정하거나 연결할 경우, String은 비효율적일 수 있습니다. 매
// StringBuffer는 문자열을 수정할 때 기존 객체를 수정하므로 성능이 더 효율적

// 스레드 안정성:
