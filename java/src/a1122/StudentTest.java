package a1122;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student( 12345678, "park");
        Student kim = new Student( 87654321, "kim");
        Student lee = new Student( 741852963, "lee");

        System.out.printf("\nStudent 객체의 수> %d", Student.count);
    }
}

class Student {

    static int count = 0;

    //인스턴스 변수
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++; // 좀 더 명확히 적기 위해 Student.count++를 하주는게 좋음.
    }
}
