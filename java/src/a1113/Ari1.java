package a1113;

public class Ari1 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; // 10 + 4 = 14 // 모든 피연산자는 int 타입으로 자동 변환 후 연산
        System.out.println();
        System.out.println("result1: " + result1);
        System.out.println();

        long result2 = v1 + v2 - v4; // 10 + 4 - 10L = 4 // 리터럴은 L을 붙이지만, 출력값엔 L이 안붙는다.
        System.out.println("result2: " + result2);
        System.out.println();

        double result3 = (double) v1 / v2; // 10 / 4 = 2.5 (double은 실수니까 ㅇㅇ)
        // 여기서 (double)로 강제 형변환 시켜주는 이유 >> 강제 형변환 없이 v1 / v2 를 계산하면 int값으로 연산이 되고, 출력만 실수로 되기 때문에, 2.0이 나온다.
        System.out.println("result3: " + result3);
        System.out.println();

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
        System.out.println();


    }
}
