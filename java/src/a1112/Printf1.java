package a1112;

public class Printf1 {
    public static void main(String[] args) {

        // 교과서 71p 참조할것 아주 중요함 ★★★★★★★★★★


        int value = 1234;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value); // 전체 자릿수가 6자리인걸 상정하는거임. 근데 그냥 6d면 빈공간으로뜸.
        System.out.printf("상품의 가격:%-6d원\n", value); // -는 왼쪽정렬해주는거다.
        System.out.printf("상품의 가격:%06d원\n", value); // 그.. 빈자리를 0으로 채워줌.

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); // 전체자릿수는 10, 소숫점은 2로 적힘. 소숫점까지 포함해서 10자리임.

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s/n", 1, name, job);
    }
}
