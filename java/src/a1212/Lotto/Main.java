package a1212.Lotto;

public class Main {
    public static void main(String[] args) {
        Membership m = new Membership();
        m.membershipGuide();

        Purchase p = new Purchase();
        p.purchaseQuestion(m);

        Loading l = new Loading();
        l.loading();

        Lottery lt = new Lottery();

        lt.randomLotteryNum();

        // 당첨된 로또번호를 출력한다.
        lt.LotteryNum();

        lt.result(m, p);
    }
}
