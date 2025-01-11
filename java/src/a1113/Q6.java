package a1113;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("국어 점수를 입력하세요. : ");
        int x = scan.nextInt();

        System.out.println();
        System.out.print("영어 점수를 입력하세요. : ");
        int y = scan.nextInt();

        System.out.println();
        System.out.print("수학 점수를 입력하세요. : ");
        int z = scan.nextInt();

        System.out.println();
        System.out.println("국어 점수: " + x);
        System.out.println("영어 점수: " + y);
        System.out.println("수학 점수: " + z);
        System.out.println();

        System.out.println("합계: " + (x + y + z));
        System.out.printf("평균: %.2f", ((double)(x + y + z) / 3));
    }
}

// 1 2 3 4 5 6 7 8 9 10