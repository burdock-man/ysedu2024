package a1127.upcasting;

public class UpcastingEx {
    public static void main(String[] args) {
        
        Parent parentRef = new Child(); // 업캐스팅 - 자식객체를 부모타입으로 변환
        parentRef.show(); // 출력 - 자식클래스 메서드 (다형성)

        if(parentRef instanceof Child) { // 만약 parentRef가 Child에 속하냐?
            Child childRef = (Child) parentRef; // 명시적형변환을 해줘야함.
            childRef.childspecial();
        } else {
            System.out.println("다운캐스팅 실패");
        }

        // 즉, 자식객체를 부모타입으로 업캐스팅 시켜도
        // 그 객체는 자식의 메서드를 사용한다.

        // childeRef 라는 자식타입의 변수에 parentRef를 넣어 강제 형변환을 해주면
        // 부모타입이었던 객체가 자식객체변수로 들어가면서 자식의 메서드를 사용가능.



    }
}

class Parent {
    void show() {
        System.out.println("부모클래스 메서드");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("자식클래스 메서드");
    }

    void childspecial() {
        System.out.println("자식특별한 메서드");
    }

}