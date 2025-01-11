package a1122;

public class CardEx {
    public static void main(String[] args) {

        System.out.println("\n카드 넓이> " + Card.width); // 객체를 미리 만들지 않아도 클래스에 정적변수를 만들어놨기 때문에
        System.out.println("카드 높이> " + Card.height); // 클래스.변수 << 를 불러올수 있다.

        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;

        System.out.printf("\nc1은 %s 모양이다.\n", c1.kind);
        System.out.printf("c1의 숫자는 %d 이다.\n", c1.number);
        System.out.printf("c1의 너비는 %d 이다.\n", c1.width);
        System.out.printf("c1의 높이는 %d 이다.\n", c1.height);

        System.out.printf("\nc2은 %s 모양이다.\n", c2.kind);
        System.out.printf("c2의 숫자는 %d 이다.\n", c2.number);
        System.out.printf("c2의 너비는 %d 이다.\n", c2.width);
        System.out.printf("c2의 높이는 %d 이다.\n", c2.height);

        c1.width = 50; // 이렇게 한놈의 정적 변수를 바꿔버리면
        c1.height = 80; // 나머지 애들도 바뀌니까 조심 ㅇㅇ

        System.out.printf("\nc1은 %s 모양이다.\n", c1.kind);
        System.out.printf("c1의 숫자는 %d 이다.\n", c1.number);
        System.out.printf("c1의 너비는 %d 이다.\n", c1.width);
        System.out.printf("c1의 높이는 %d 이다.\n", c1.height);

        System.out.printf("\nc2은 %s 모양이다.\n", c2.kind);
        System.out.printf("c2의 숫자는 %d 이다.\n", c2.number);
        System.out.printf("c2의 너비는 %d 이다.\n", c2.width);
        System.out.printf("c2의 높이는 %d 이다.\n", c2.height);

    }
}

class Card {
    String kind;
    int number;

    static int width = 100; // 클래스 변수(Static 변수, 정적 변수)
    static int height = 250;
    
}

// Card의 인스턴스인 c1과 c2는 클래스(static) 변수인 width, height를 공유하기 때문에
// c1의 width, height를 변경하면 c2도 변경된다.