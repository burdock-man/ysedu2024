package a1113;

public class Q3 {
    public static void main(String[] args) {
        System.out.println();

        int x = 0;

        for(int i = 1; i <= 100; i++) {
            // System.out.println(i);
            // x = (x + i);
            x += i;
        }

        System.out.println("1부터 100까지 합은 " + x + "입니다.");

    }
}
