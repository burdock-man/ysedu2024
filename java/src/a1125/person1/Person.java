package a1125.person1;

public class Person {

    private static int count;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public static int getCount() {return count;}
    // public static int getTotalCount() {return count;}

}

// 정적변수 (Static) - 클래스변수
// 클래스 이름을 직접 접근할 수 있는 변수. 즉, 클래스의 모든
// 정적변수는 클래스에 속하고, 객체를 생성하지 않고도
// 객체가 공유되는 하나의 값을가진다.