package a1127.upcasting;

class Animal {
    public void move() {
        System.out.println("움직여용.");
    }
}

class Bird extends Animal {

    public void bark() {
        System.out.println("짹짹쓰");
    }

    @Override
    public void move() {
        System.out.println("날아가용.");
    }
}


public class downcasting1 {
    public static void main(String[] args) {
        Animal animal = new Bird();
        Bird bird = new Bird();
        bird.bark();
        bird.move();

        Animal bird1 = new Bird();
        // bird1.bark(); // 안됨. 자식의 특별한 매서드는 사용못함.
        bird1.move();

        // if(animal instanceof Bird) { // 자바 낮은버전도 가능
        //     Bird bird2 = (Bird) animal;
        //     bird2.bark();
        // } else {
        //     System.out.println("실패!");
        // }


        if(animal instanceof Bird bird3) { // 자바 17이상부터 가능
            // Bird bird2 = (Bird) animal;
            bird3.bark();
        } else {
            System.out.println("실패!");
        }
    }
}


