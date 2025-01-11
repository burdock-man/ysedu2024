package a1121.homework;

import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int width;
        int height;

        System.out.print("\n가로 길이를 입력하세요> ");
        width = scan.nextInt();
        System.out.print("세로 길이를 입력하세요> ");
        height = scan.nextInt();




        Rectangle rect1 = new Rectangle(width, height); // 객체 생성

        System.out.println();
        System.out.printf("사각형의 면적은 %d 입니다.", rect1.getArea(width, height));
        System.out.printf("\n사각형의 둘레는 %d 입니다.", rect1.getPerimeter(width, height));

    }
}
