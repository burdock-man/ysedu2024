package a1127.game2;

public class Main {
    public static void main(String[] args) {
        Hero[] heros = {
            new Warrior("전사"),
            new Archer("궁수"),
            new Wizard("마법사"),
        };

        for (Hero iii : heros) {
            System.out.println();
            System.out.printf("**%s의 차례**\n", iii.name);
            iii.attack();

            if (iii instanceof Warrior temp) { // 자바 12부터 그냥 변수로 선언하고 바로 집어넣어도 됨.
                temp.groundCutting();
            } else if (iii instanceof Archer temp) {
                temp.fireArrow();
            } else if (iii instanceof Wizard temp) {
                temp.freezing();
            } else {
                System.out.println("잘못됐슴당;");
            }

            // if (iii instanceof Warrior) { // 자바 12 전엔 이렇게 일일이 넣어줘야했음.
            //     Warrior temp = (Warrior) iii;
            //     temp.groundCutting();
            // } else if (iii instanceof Archer) {
            //     Archer temp = (Archer) iii;
            //     temp.fireArrow();
            // } else if (iii instanceof Wizard) {
            //     Wizard temp = (Wizard) iii;
            //     temp.freezing();
            // } else {
            //     System.out.println("잘못됐슴당;");
            // }
        }
    }
}
