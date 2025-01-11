package a1112; // 패키지 선언: 이 파일이 a1112 패키지에 속함을 나타냄

import java.util.Scanner; // Scanner 클래스 임포트: 사용자 입력을 받기 위해 java.util 패키지의 Scanner 클래스를 가져옴

public class Scan4 { // Scan4라는 클래스 선언 시작
    public static void main(String[] args) { // main 메서드 선언: 프로그램 실행의 시작 지점
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성: 표준 입력(System.in)으로부터 데이터를 입력받기 위해 Scanner 객체를 초기화함

        System.out.println("x값 입력: "); // 사용자 안내 출력: x값 입력을 요청하는 메시지를 출력함
        String strX = scanner.nextLine(); // x값 입력받기: 사용자가 입력한 한 줄의 문자열을 읽어서 strX 변수에 저장
        int x = Integer.parseInt(strX); // 문자열을 정수로 변환: strX 문자열을 정수형(int)로 변환하여 변수 x에 저장

        System.out.println("y값 입력: "); // 사용자 안내 출력: y값 입력을 요청하는 메시지를 출력함
        String strY = scanner.nextLine(); // y값 입력받기: 사용자가 입력한 한 줄의 문자열을 읽어서 strY 변수에 저장
        int y = Integer.parseInt(strY); // 문자열을 정수로 변환: strY 문자열을 정수형(int)로 변환하여 변수 y에 저장

        int result = x + y;
        System.out.println("x + y = " + result);

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");


    }
}
