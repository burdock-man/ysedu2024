package a1113;

public class Ex03 {
    public static void main(String[] args) {
        double decimal = 9.99;
        // int wholeNumber = decimal; // 큰거에서 작은걸로 넘어가려면 강제변환 해줘야함.
        int  wholeNumber = (int)decimal; // 요것처럼 ㅇㅇ
        System.out.println(wholeNumber); // 근데 int는 정수 리터럴만 적을수 있으므로 소수점은 전부 무시된다.
        
    }
}
