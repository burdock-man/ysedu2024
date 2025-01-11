package a1122;

public class final1 {
    public static void main(String[] args) {

        Car1 c1 = new Car1("현대", "제네시스");
        c1.display();
        // c1.brand = "기아";
        // c1.display();
    }
}

class Car1 {
    final String brand; // final 필드 선언
    final String model;

    // Car1() {}

    // final : 객체마다 고유하지만 한번만 초기화 후 변경할수 없는 데이터.
    // static final 상수 클래스 차원에서 모든 객체가 공유하며,
    // 변경할 수 없는 고정데이터
    // static final double pi = 3.14159;


    Car1(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.printf(("\n브랜드> %s, 모델> %s\n"), brand, model);
    }
}
