package a1127.zoo;

public class Fish extends Animal {


    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void move() {
        System.out.println("지느러미로 헤엄친다");
    }

    @Override
    void sound() {
        System.out.println("뻐끔뻐끔");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
