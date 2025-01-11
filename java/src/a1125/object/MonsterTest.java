package a1125.object;

public class MonsterTest {
    public static void main(String[] args) {

        Monster orc = new Monster("오크", 30);
        Monster skeleton = new Monster("해골", 30);

        Monster.battle(orc, skeleton);


    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String name, int hp) {
        this.name = name;
        // this.hp = 30;
        this.hp = maxHp;
    }

    public void battle(Monster a, Monster b) {
        
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }

        // System.out.printf("\n[%d]는 쓰러졌다, [%d]의 승리!", );
    }

    private void attack(Monster enemy) {
        System.out.printf("\n[%s]의 공격\n", name); // this.name이랑 또오옥같다.
        enemy.hp = enemy.hp - 10;
        System.out.printf("%s의 체력: %d,(%d)\n", enemy.name, enemy.hp, maxHp);
    }
}
