package a1210;

import java.util.Scanner;

public class Castion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n넓이 계산을 원하는 도형 유형을 선택해주세요.");
        System.out.println("1. 원형\t2. 사각형\t3. 삼각형");
        System.out.print("선택>>> ");
        int shape = scan.nextInt();
        Shape shapeObject = new Shape("");
        double area = 0;

        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요.");
                System.out.print("반지름>>> ");
                double radius = scan.nextDouble();
                area = shapeObject.calculateArea(radius);
                break;
        
            case 2:
                System.out.println("가로와 세로를 입력하세요.");
                System.out.print("가로>>> ");
                double width = scan.nextDouble();
                System.out.print("세로>>> ");
                double height = scan.nextDouble();
                area = shapeObject.calculateArea(width, height);
                break;
        
            case 3:
                System.out.println("밑변과 높이를 입력하세요.");
                System.out.print("가로>>> ");
                double base = scan.nextDouble();
                System.out.print("세로>>> ");
                double triHeight = scan.nextDouble();
                area = shapeObject.calculateArea(base, triHeight, true);
                break;
        
            default:
                System.out.println("잘못된 입략입니다.");
                break;
        }
        System.out.println(shapeObject.getRender() + "의 넓이 :" + area);
    }
}

class Shape {
    private String render;
    public Shape(String render) {
        this.render = render;
    }

    public String getRender() {
        return render;
    }

    // 원형 넓이 계산
    public double calculateArea(double radius) {
        this.render = "circle";
        return Math.PI + Math.pow(radius, 2);
    }

    // 사각형 넓이 계산
    public double calculateArea(double width, double height) {
        this.render = "rectangle";
        return width * height;
    }

    // 삼각형 넓이 계산
    public double calculateArea(double base, double height, boolean isTriangle) {
        if(isTriangle) {
            this.render = "triangle";
            return 0.5 * base * height;
        }
        return 0; // 삼각형이 아닐경우 기본값 반환
    }
}
