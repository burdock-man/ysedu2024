package a1202.exception1;

public class Exception3 {
    public static void main(String[] args) {
        // 숫자형식 오류

        String str = "abc";

        try {
            int numbers = Integer.parseInt(str);
        } catch (NumberFormatException e) {

            System.out.println("숫자의 형식이 올바르지 않아요." + e.getMessage());

        }
    }
}
