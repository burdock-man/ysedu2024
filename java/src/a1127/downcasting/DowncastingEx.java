package a1127.downcasting;

public class DowncastingEx {
    public static void main(String[] args) {
        
        Child childObj = new Child();
        Parent parentObj = new Parent();

        childObj.show(); // 출력 - 자식클래스 메서드
        childObj.childspecial(); // 출력 - 자식특별한 메서드
        parentObj.show(); // 출력 - 부모클래스 메서드
        Parent parentRef = childObj; // 업캐스트 -> 자식이 부모의 메서드를 사용하고 싶을때. (묵시적 형변환)
        // Parent parentRef = (Parent) childObj; // (Parent)로 명시 가능
        parentRef.show(); // 출력 - 자식클래스 메서드
        // parentRef.childspecial(); // 출력불가. 자식을 부모타입으로 업캐스팅하면 자식의 메서드는 사용못함.
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