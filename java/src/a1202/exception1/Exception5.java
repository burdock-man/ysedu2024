package a1202.exception1;

class CustomException extends Exception { // Exception5가 아니라, Exception인 이유는 자바 기본 클래스임.
    public CustomException(String message) {
        super(message);
    }
}



public class Exception5 {

    // 사용자 정의 예외

    public static void main(String[] args) {
            try {
                validate(15);
            } catch (CustomException e) {
                System.out.println("사용자 정의 예외");
            }
        }
            
        private static void validate(int age) throws CustomException {
            if(age < 18) {
                throw new UnsupportedOperationException("나이는 18세 이상이여야 함");
            }
        }



}
