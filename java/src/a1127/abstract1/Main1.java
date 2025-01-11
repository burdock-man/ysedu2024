package a1127.abstract1;

// 추상클래스
abstract class Animal {
    // 공통속성
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // 일반 메서드
    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }

    // 추상 메서드 (자식 클래스에서 반드시 구현 필요)
    public abstract void sound();
}

// 구체적인 자식 클래스
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println(name + "이(가) 멍멍쓰 짖습니다.");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println(name + "이(가) 야옹쓰 짖습니다.");
    }
}


public class Main1 {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 추상클래스는 객체 생성 불가능
        Animal[] animal = {
            new Dog("갱얼쥐"),
            new Cat("곤냔니"),
        };
        
        animal[0].sleep();
        animal[0].sound();
        
        animal[1].sleep();
        animal[1].sound();
    }
}
