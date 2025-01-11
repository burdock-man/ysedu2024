package a1120.class1;

public class Car {
    // 필드선언
    // public String company;
    // public String model;
    // public String color;
    // public int maxSpeed;
    // public int speed;

    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    public Car(){};

    // public Car ( // 이게 정석인데 넘 길어서 보기싶으면
    //     String company,
    //     String model,
    //     String color,
    //     int maxSpeed,
    //     int speed
    // ) {
    //     this.company = company;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed = maxSpeed;
    //     this.speed = speed;
    // }


    public Car (String com, String mod, String col, int max, int spd) {
        company = com;
        model = mod;
        color = col;
        maxSpeed = max;
        speed = spd; // 일케 쓰면 된당.
    }
}
