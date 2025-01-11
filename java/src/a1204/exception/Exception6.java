package a1204.exception;

public class Exception6 {
    public static void main(String[] args) {
        String[] names = {"kim", "lee", "park", "choi"};
        try {
            System.out.printf("\n0번 인덱스 요소:%s\n",names[0]);
            System.out.printf("4번 인덱스 요소:%s\n",names[4]);
            System.out.printf("3번 인덱스 요소:%s\n",names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 접근이 잘못되었습니다.");
        } finally {
            System.out.println("\nfinally 문은 예외발생과 상관없이 항상 수행됩니다.");
            System.out.printf("4번 인덱스 요소:%s\n",names[4]);

        }
    }
}
