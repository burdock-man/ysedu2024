package a1127.number1;

public class Number {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;
        double result = a + b;
        System.out.println("결과: " + result); // 묵시적 형변환

        double d = 9.99;
        int r = (int) Math.round(d); // Math.rooun() == 반올림. double 을 int로 반올림하면 에러남. (int)를 사용해 명시적 형변환.
        int t = (int) d;
        System.out.println("반올림값: " + r); 
        // int -> double 자동(묵시적) - 데이터손실 없음, 형변환필요없음.
        // double -> int 명시적(명시적, 강제형변환) - 소수점 아래 제거 (데이터 손실), (int)로 명시
    }
}
