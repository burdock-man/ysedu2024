package a1118;

public class SubString1 {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6); // 6 '전'까지 거시기 해라. (대신 다른 변수에 저장해야함)
        System.out.println();
        System.out.println(firstNum);
        String secondNum = ssn.substring(7); // 7'부터' 끝까지 거시기해라.
        System.out.println();
        System.out.println(secondNum);
    }
}
