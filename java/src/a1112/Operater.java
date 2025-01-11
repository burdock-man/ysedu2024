package a1112;

public class Operater {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 10;
        // byte result = a + b; // 이건 안됨. 근데 byte result = 10 + 10; 이건 됨 ㅋㅋ 시벌 byte는 변수의 계산은 안되나봄.
        int result1 = v1 + v2; // 이건 됨
        System.out.println("result1: " + result1);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result2 = v3 + v4 + v5; // long 타입으로 변환후 연산
        System.out.println("result2: " + result2);

        char v6 = 'A';
        char v7 = 1;
        int result3 = v6 + v7; // 유니코드 문자를 int 타입으로 변환 후 연산 65 + 1
        System.out.println("result3: " + result3);
        System.err.println("result3 UNI: " + (char)result3);

        int v8 = 10;
        int result4 = v8 / 4; // 정수 연산의 결과는 정수
        System.out.println("result4: " + result4);

        int v9 = 10;
        double result5 = v9 / 4.0; // double 타입으로 변환 후 연산
        System.out.println("result5: " + result5);

        int v10 = 10;
        int v11 = 2;
        double result6 = v10 / v11; // 더블타입이라 소수점 .0까지 기입됨.
        System.out.println("result6: " + result6);

        int v12 = 9;
        int v13 = 2;
        double result7 = (double)v12 / v13; // v12앞에 더블타입을 붙여주면 소수점까지 표시. // 근데 int가 아니라 double타입으로 선언하면 굳이 (double) 안붙여도 됨.
        System.out.println("result7: " + result7);
    }
}
