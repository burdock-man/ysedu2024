package a1112;

public class Boolean {
    public static void main(String[] args) {
        boolean stop = true;
        if(stop) {
            System.out.println("장비를 정지합니다.");
        } else {
            System.out.println("안되잖아.");
        }
        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }

    public static boolean parseBoolean(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parseBoolean'");
    }
}
