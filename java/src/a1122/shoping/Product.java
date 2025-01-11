package a1122.shoping;

public class Product {
    private String name;
    private double price;
    private int stock;
    private static int prodNum = 0;
    private int prodId = 0;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        Product.prodNum++;
        prodId = prodNum;

        if (price < 0) {
            this.price = 0;
        } else if (stock < 0) {
            this.stock = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) {
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }
    
    public void addStock(int i) {
        if(i < 0) {
            stock = 0;
            System.out.println("\n*** 재고 추가 실패: 음수 값은 허용되지 않습니다. ***");
        } else {
            this.stock += i;
            System.out.println("\n*** " + i + "개의 재고가 추가되었습니다. ***\n");
        }
    }

    public String prodStr () {
        return String.format("%d. 상품명: %s, 가격: %.2f, 재고: %d", prodId, name, price, stock);
    }


    public void sellProduct(int i) {
        if (i > this.stock) {
            System.out.println("\n*** 요청 수량 " + i + "개. 판매 실패 : 재고가 부족합니다. ***");
        } else if (i < 0) {
            System.out.println("*** 요청 수량 " + i + "개. 판매 실패 : 양수로 입력해주세요. ***");
        } else {
            this.stock -= i;
            System.out.println("*** 요청 수량 " + i + "개. 판매 완료. ***\n");
        }
    }


}
