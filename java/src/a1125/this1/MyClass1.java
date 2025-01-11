package a1125.this1;

public class MyClass1 {
    public static void main(String[] args) {
        
        MyClass obj1 = new MyClass(10);
        obj1.myMethod();
        MyClass obj2 = new MyClass();
        obj2.myMethod();
        
    }
}

class MyClass {
    int myVariable;

    public MyClass(int myVariable) {
        this.myVariable = myVariable;
    }

    public MyClass() {
        this(0);
    }

    public void myMethod() {
        System.out.println("My variable value is " + this.myVariable);
    }

}

// "this"와 "this()"는 각 객체의 참조와 생성자 호출로, 서로 다른 선택자다.
// tihs.myVariable == 객체의 필드
// this() 다른 생성자 호출