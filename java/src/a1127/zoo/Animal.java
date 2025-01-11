package a1127.zoo;

abstract class Animal {
    String name;
    int age;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}


    public Animal() {
        this("이름없음", 0);
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void sound();

    abstract void move();
    
    public void info(Animal s) {
        if (s instanceof Dog) {
            System.out.println("[개] 이름: " + name + ", 나이: " + age);
        }
        if (s instanceof Bird) {
            System.out.println("[새] 이름: " + name + ", 나이: " + age);
        }
        if (s instanceof Fish) {
            System.out.println("[물고기] 이름: " + name + ", 나이: " + age);
        }
    }

}
