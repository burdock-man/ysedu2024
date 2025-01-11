package a1120;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("\n=======================================================");

        Scanner scan = new Scanner(System.in);
        int student3 = 0;
        int[] grades3 = new int[student3];
        int sum3 = 0;
        int max3 = 0;
        double avg3 = 0.0;

        while (true) {
            // try { // 예외처리
            System.out.println("\n......................................................");
            System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
            System.out.println("......................................................");

            System.out.print("\n선택> ");
            int choice3 = scan.nextInt(); // int choice3 = Integer.parseInt(scan.nextLine()); 이게 더 안정적

            if(choice3 == 1) {
                student3 = 0; // 초기화
                grades3 = new int[student3]; // 초기화
                System.out.print("학생수> ");
                student3 = scan.nextInt();
                grades3 = new int[student3];
            }
            if(choice3 == 2) {
                if(student3 <= 0) {
                    System.out.println("학생수를 입력하세요.");
                } else {
                    for (int i = 0; i < student3; i++) { // 초기화
                            grades3[i] = 0;
                            max3 = 0;
                            sum3 = 0;
                            avg3 = 0.0;
                    }
                    System.out.println("점수를 입력해주세요.");
                    for (int i = 0; i < student3; i++) {
                        System.out.printf("학생%d의 성적> ",i + 1);
                        grades3[i] = scan.nextInt();
                        sum3 += grades3[i];
                        if (max3 < grades3[i]) max3 = grades3[i];
                        avg3 =  (double) sum3 / student3;
                    }
                }
            }
            if(choice3 == 3) {
                if(student3 <= 0) {
                    System.out.println("학생수를 입력하세요.");
                } else {
                    for (int i = 0; i < student3; i++) {
                        System.out.printf("학생%d의 성적> %d\n", i + 1, grades3[i]);
                    }
                }
            }
            if(choice3 == 4) {
                if(student3 <= 0) {
                    System.out.println("학생수를 입력하세요.");
                } else {
                    System.out.printf("최고 점수> %d\n", max3);
                    System.out.printf("평균 점수> %.1f\n", avg3);
                }
            }
            if(choice3 == 5) {
                System.out.println("프로그램 종료");
                break;
            }
            if(choice3 < 1 || choice3 > 5) System.out.println("잘못된 번호입니다.");

        // }catch(NumberFormatException e) {
        //     System.out.println("숫자를 입력하세요");
        // }
        }

        // 위의 내용을 switch case문으로 변경 작성

        System.out.println("\n=======================================================");
    }
}
