package a1120.class1;

public class CarEx {
    public static void main(String[] args) {
        Car cr1 = new Car(); // 한개만 할때는 자동생성자
        cr1.company = "현대"; // 안만들어도 되는데
        cr1.model = "봉고";
        cr1.color = "황금";
        cr1.maxSpeed = 300;
        cr1.speed = 200;

        System.out.println("\n회사> " + cr1.company);
        System.out.println("모델> " + cr1.model);
        System.out.println("색상> " + cr1.color);
        System.out.println("최고속도> " + cr1.maxSpeed);
        System.out.println("속도> " + cr1.speed);

        cr1.speed = 60;

        System.out.println("수정된 속도> " + cr1.speed);

        Car cr2 = new Car("기아", "투싼", "쥐색", 220, 65);
        // 생성자를 호출해서 매개변수를 넣는 방식을 쓸 때는 이게 좋당
        System.out.println("\n회사> " + cr2.company);
        System.out.println("모델> " + cr2.model);
        System.out.println("색상> " + cr2.color);
        System.out.println("최고속도> " + cr2.maxSpeed);
        System.out.println("속도> " + cr2.speed);
    }
}
