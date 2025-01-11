package a1126.sec06.package1;

public class B extends A {
    public static void main(String[] args) {
        A a = new A(); // 프로텍트 걸었는데 에러는 안뜨넹
        a.field = "value"; // 프로텍트 뭐야
        a.method();
    }
}