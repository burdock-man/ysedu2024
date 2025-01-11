package a1121.class2;

public class Main2 {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객채화 == 인스턴스화 를 한거임.

        p1.name = "홍길동";
        p1.age = 30;
        p1.gender = "남성";

        System.out.println("\n이름: " + p1.name);
        System.out.println("나이: " + p1.age);
        System.out.println("성별: " + p1.gender);
        System.out.println("주소: " + p1);

        Person p2 = new Person("곽두칠", 98, "여성");
        // 자동생성자는 속성의 갯수와 타입에 맞게 입력해야 생성됨.
        System.out.println("\n이름: " + p2.name);
        System.out.println("나이: " + p2.age);
        System.out.println("성별: " + p2.gender);




    }
}
