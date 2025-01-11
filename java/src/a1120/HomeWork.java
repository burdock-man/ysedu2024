package a1120;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("\n(201p 7번문제)=========================================");

        int[] array1 = {1, 5, 3, 8, 2}; // 배열에서 최대값 출력하는 코드 (for문 사용)

        int max1 = 0;
        int min1 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (max1 < array1[i]) max1 = array1[i];
            if (min1 > array1[i] || min1 == 0) min1 = array1[i];
        }

        System.out.println("\n최대값: " + max1);
        System.out.println("최소값: " + min1);

        System.out.println("\n=======================================================");
        System.out.println("\n(201p 8번문제)=========================================");

        int[][] array2 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}}; // 배열 항목 전체 합과 평균을 구해 출력하는 코드 (중첩for문 사용)

        int sum2 = 0;
        int num2 = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
                num2++;
            }
        }

        double avg2 = (double) sum2 / num2;

        System.out.println("\n합계: " + sum2);
        System.out.printf("평균: %.2f\n", avg2);

        System.out.println("\n=======================================================");
        System.out.println("\n(201p 9번문제)=========================================");

        Scanner scan = new Scanner(System.in);
        int student3 = 0;
        int[] grades3 = new int[student3];
        int sum3 = 0;
        int max3 = 0;
        double avg3 = 0.0;

        while (true) {
            System.out.println("\n......................................................");
            System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
            System.out.println("......................................................");

            System.out.print("\n선택> ");
            int choice3 = scan.nextInt(); // int choice3 = Integer.parseInt(scan.nextLin()); 이게 더 안정적

            if(choice3 == 1) {
                student3 = 0; // 초기화
                grades3 = new int[student3]; // 초기화
                System.out.print("학생수> ");
                student3 = scan.nextInt();
                grades3 = new int[student3];
            }
            if(choice3 == 2) {
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
            if(choice3 == 3) {
                for (int i = 0; i < student3; i++) {
                    System.out.printf("학생%d의 성적> %d\n", i + 1, grades3[i]);
                }
            }
            if(choice3 == 4) {
                System.out.printf("최고 점수> %d\n", max3);
                System.out.printf("평균 점수> %.1f\n", avg3);
            }
            if(choice3 == 5) {
                System.out.println("프로그램 종료");
                break;
            }
            if(choice3 < 1 || choice3 > 5) System.out.println("잘못된 번호입니다.");
        }

        System.out.println("\n=======================================================");
    }
}
