package a1127.animal2;

abstract class Animal {
    protected String name;
    protected String age;
   
    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }
    //추상메서드
    abstract void sound();
    abstract void move();

    
}
