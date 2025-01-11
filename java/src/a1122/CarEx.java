package a1122;

class Car {
    String brand;
    String model;

    Car() {
        this("Unknown", "Unknown");
    }
    
    Car(String brand) {
        this(brand, "Unknown");
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println();
        System.out.printf("Brand: %s, Model: %s", brand, model);
    }
}

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("Honda", "Civic");

        c1.display();
        c2.display();
        c3.display();
    }
}
// this 현재 객체 자신을 참조
// this() 현재클래스의 다른 생성자 호출??? 뭔소리징