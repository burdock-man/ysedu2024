package a1112;

import java.util.Scanner; // 이건 왜 적는건지 모르겠음. 이게 멈추는건가?

public class Scan1 {
    public static void main(String[] args) { // 일단 println은 보통 자바가 실행되자마자 출력이 되는데
        Scanner scan = new Scanner(System.in); // 그걸 스캐너라고 선언하면 출력을 일단 멈추고, 키보드로 입력했을 때 그 값을 받는다.
        // Scanner 객체 생성 System.in(콘솔)에서 입력받는다.
        int num = scan.nextInt();
        System.out.println("value: " + num);
    }
}
