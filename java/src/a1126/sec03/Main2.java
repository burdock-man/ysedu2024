package a1126.sec03;

public class Main2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.display();
    }
}

class Parent2 {
    int x = 10;
    void show() {
        System.out.println("Parent show()");
    }
}

class Child2 extends Parent2{
    int x = 20;
    void display() {
        System.out.println("X in childe: " + x);
        System.out.println("X in parent: " + super.x);
        super.show();
    }
}


