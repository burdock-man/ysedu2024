package a1121.method;

public class MethodTypeTest {
    public static void main(String[] args) {
        
        MethodType test = new MethodType();

        test.printName(); // 출력 홍길동
        int k = test.printNumber(); // 10 반환
        System.out.println("반환값: " + k);
        double j = test.multiply(2, 4.5); // mult1iple 곱셈 매서드 반환
        System.out.println("반환값: " + j);
    }
}
