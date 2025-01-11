package a1113;

public class Ari2 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number*pieceUnit; // 1 - (0.1 * 7) == 1 - 0.7 인데, 0.3이 아니라 0.299...993이 나옴.

        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
