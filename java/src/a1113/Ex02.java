package a1113;

public class Ex02 {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.5;
        double result = x + y;
        System.out.println(result);
        // int와 double을 더할 때 int가 double로 자동 형변환됨. 바운더리가 작은곳에서 큰곳으로 가는게 보통 ㅇㅇ
        // 근데 double은 실수이기 때문에 소수점까지 반영. 따라서 x + y 는 10 + 3.5이고, 13.5가 출력.

    }
}
