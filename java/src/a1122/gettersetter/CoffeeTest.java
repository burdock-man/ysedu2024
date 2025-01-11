package a1122.gettersetter;

public class CoffeeTest {
    public static void main(String[] args) {
        
        Coffee cof1 = new Coffee("아메리카노", 3000);
        // 현재의 커피이름과 가격을 출력해 보세요.

        System.out.println("\n커피 이름> " + cof1.getName());
        System.out.println("커피 가격> " + cof1.getPrice());

        cof1.setPrice(3500);

        System.out.println("인상된 커피 가격> " + cof1.getPrice());

    }
}

class Coffee {
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}
