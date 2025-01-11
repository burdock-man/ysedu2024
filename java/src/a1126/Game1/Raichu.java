package a1126.Game1;

// 자식클래스 extended 부모클래스 {}
public class Raichu extends Pikachu{
    
    public Raichu() {
        super(200, "웅취가득");
    }
    
    public Raichu(int energy, String type) {
        super(energy, type, 20);
    }
    
    public Raichu(int energy, String type, int level) {
        super(energy, type, level);
    }

    @Override
    public String aAttack() {
        return "웅취볼뜨";
    }

    @Override
    public String bAttack() {
        return "볼뜨 쩨인지";
    }

    public String cAttack() {
        if (level >= 40) {
            return "아이언테일";
        } else {
            return "사용불가";
        }
    }

}
