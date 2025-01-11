package a1203.coffee;

import java.util.Map;

public class Customer {
    private int orderName; // 주문 번호

    public int getOrderName() {return orderName;}

    private Map<String, Integer> coffeeOrder; // 주문한 커피와 금액을 담을 map 선언

    private int money; // 잔액

    public int getMoney() {return money;}
    public void setMoney(int money) {this.money = money;}

    public Customer(int s) {
        orderName = s;
        this.money = 300000;
    }

    // public void setCoffeeOrder(Map<String orderList) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setCoffeeOrder'");
    // }
}
