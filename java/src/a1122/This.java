package a1122;

public class This { // 한 java파일 안에 두개 이상의 클래스가 작성될 경우 메인함수가 포함된 애가 public이 붙는게 기본적임.
    public static void main(String[] args) {
        Person p1 = new Person("곽두칠");
        p1.display();
    }
}

class Person {
    String name;

    public Person(String n) {
        this.name = n; // this를 빼면 null
    }
    void display() {
        System.out.println("\nName: " + name); // this.name을 써도됨.
    }
}
