package a1121.overloading;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model = "입력되지 않았습니다.";
    String color = "입력되지 않았습니다.";
    int maxSpeed = 0;

    // 생성자 선언
    Car() {}

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
