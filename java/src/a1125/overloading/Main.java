package a1125.overloading;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("오잉");
    }
}

class Printer {
    public void println(int value) {
        System.out.println(value);
    }

    public void println(boolean value) {
        System.out.println(value);
    }

    public void println(double value) {
        System.out.println(value);
    }

    public void println(String value) {
        System.out.println(value);
    }

}

// println() 메서드를 각각 int, boolean, double, String 타입에
// 오버로딩하여 선언.
// println(값) > 값에 적는 타입에 따라 오버로딩 한것들이 적용됨.
