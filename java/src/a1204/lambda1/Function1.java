package a1204.lambda1;

interface Claculator {
    int sum(int a, int b);
}

class Mycalculator implements Claculator{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Function1 {
    public static void main(String[] args) {
        Mycalculator mc = new Mycalculator();
        int result = mc.sum(3, 4);
        System.out.println(">>> " + result);
    }
}
