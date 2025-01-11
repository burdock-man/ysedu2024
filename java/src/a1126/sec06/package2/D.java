package a1126.sec06.package2;

import a1126.sec06.package1.A; // 임포트 되면 프로텍티드를 호출 가능하다.

public class D extends A {

    // 자바교과서 305p 참고

    public D () {
        super();
    }
    public void method1() {
        this.field = "value"; // A의 값 변경
        this.method(); // A메서드 호출
    }
    public void method2() {
        A a = new A(); // 이건 안..ㄹ.돼? 난 왜 되지
        // a.field = "value"; // 이것도 안됨
        // a.method(); // 이것도 안됨.
    }
}
