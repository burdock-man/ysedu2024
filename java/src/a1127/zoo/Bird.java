package a1127.zoo;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void move() {
        System.out.println("날개로 날아간다");
    }

    @Override
    void sound() {
        System.out.println("짹짹");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
