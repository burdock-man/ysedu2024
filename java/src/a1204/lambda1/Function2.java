package a1204.lambda1;

// 함수형 인터페이스
interface Claculator1 {
    int sum(int a, int b);
    // int mul(int a, int b);
    // Calculator1 인터페이스의 매서드가 1개 이상이면 사용 못함
}

public class Function2 {
    public static void main(String[] args) {
        Claculator1 mc = (int a, int b) -> a + b; // 람다를 적용한 함수
        // 괄호사이의 int a, int b는 Calculator 인터페이스 sum 함수의 입력항목이 배당
        // 뒤에 -> a + b가 리턴값에 해당
        // 이렇게 람다함수를 사용하면 MyCalculator와 같은 실제 클래스 없이도
        // Calculator 객체를 생성할  수 있고, 일반적인 코드보다 훨씬 간단하다.
        int result = mc.sum(3, 4);
        System.out.println(">>> " + result);
    }
}
