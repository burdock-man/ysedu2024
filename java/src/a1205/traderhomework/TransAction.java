package a1205.traderhomework;

public class TransAction {
    private Trader trader;
    private int year;
    private int value;
    
    public TransAction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    
    public Trader getTrader() {return trader;}
    public int getYear() {return year;}
    public int getValue() {return value;}

    @Override
    public String toString() {
        return "[name = " + trader.getName() + ", city = " + trader.getCity() + ", year = " + year + ", value = " + value + "]";
    }

}
