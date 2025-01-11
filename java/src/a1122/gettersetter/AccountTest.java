package a1122.gettersetter;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();

        // acc.balance = 20; // 이거 프리베이트라 안됨 ㅇㅇ
        acc.setBalance(20); // 일케하면 됨

        // System.out.printf("\n잔액> %d\n", acc.balance); // 얘도 역시나 안됨 ㅇㅇ
        System.out.printf("\n잔액> %d\n", acc.getBalance()); // 얘도 역시나 안됨 ㅇㅇ
    }
}

class Account {
    private int balance;
    
    // 게터 메서드
    public int getBalance() {
        return balance;
    }
    
    // 세터 메서드
    public void setBalance(int b) {
        balance = b;
    }
}
