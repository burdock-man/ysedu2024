package a1127.game2;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    public void groundCutting() {
        System.out.println("[전사] 대지가르기!");
    }
    @Override
    public void attack() {
        System.out.println("[전사] 도끼찍기!");
    }
}
