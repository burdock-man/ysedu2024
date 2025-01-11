package a1126.sec03;

public class Main1 {
    public static void main(String[] args) {
        Child1 child = new Child1();
        
    }
}

class Parent1 {
    Parent1(String name) {
        System.out.println("Parent constructor with name" + name);
    }
}

class Child1 extends Parent1{
    Child1() {
        super("Jhon");  // 부모 클래스의 생성자를 명시적으로 호출 (자동 호출됨)
        System.out.println("Child constructor");
    }
}


