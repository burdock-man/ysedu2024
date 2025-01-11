package a1126.hak3;

public class Main5 {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        // System.out.println(person); // 이건 주소가 나오고
        // System.out.println(person.name); // 이건 private라서 안나온다.
        // System.out.println(person.toStr()); // 이렇게 따로 메서드를 만드는것도 번거롭고
        // 근데 getter 없이 출력하고싶다면
        System.out.println(person.toString());
        // 모든 자바 클레스는 Object 라는 클래스를 상속한다.
        // 보통은 Object 생략.
        // toString()은 Object에서 상속받은 메서드인데,
        // 객체의 문자열 표현을 정의하는 메서드임.
        // 그래서 toString을 오버라이딩해서 문자열을 가지고오도록
        // 메서드를 바꾸면 됨.
                
            }
        }
        
        class Person {
            private String name;
            private int age;
        
            public String getName() {return name;}

            public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public String toStr() {
    //     return String.format("이름: %s, 나이: %d",name, age);
    // }
    @Override
    public String toString() {
        return "Person [name= " + name + ", age= " + age + "]";
    }
}