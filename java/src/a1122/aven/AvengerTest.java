package a1122.aven;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("또르", 100);
        Avenger thanos = new Avenger("노스형", 160);

        thor.punch(thanos);
        thanos.punch(thor);
            }
        }
        
        class Avenger {
            String name;
            int hp;
        
            public Avenger(String name, int hp) {
                this.name = name;
                this.hp = hp;
            }
        
            public void punch(Avenger enemy) {
                System.out.printf("\n[%s], [%s]에게 펀치!\n",name ,enemy.name);
                System.out.printf("[%s], 엄청 아프다!\n", enemy.name);
                System.out.printf("[%s]의 HP, %d → %d\n", enemy.name, enemy.hp, enemy.hp - 10);
                enemy.hp -= 10; 
            }
}