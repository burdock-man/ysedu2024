package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] score = new int [3][3];

        int sum = 0;
        int student = 0;
        int k;

        for(int i = 0; i < score.length; i++) {
            System.out.println("\n--" + (i + 1) + "반---------------------------------");
            System.out.printf("%d반 학생들의 수학 점수를 입력하세요\n", i+1);
            int classSum = 0;
            k = 0;

            for(k = 0; k < score[i].length; k++) {
                System.out.printf("%d반 %d번: ", i+1, k+1);
                score[i][k] = scan.nextInt();
                sum += score[i][k];
                classSum += score[i][k];
                student += k;
            }

            double classAvg = (double) classSum / k+1;
            System.out.println("\n" + (i + 1) + "반 수학 점수 총합: " + classSum);
            System.out.printf("%d반 수학 점수 평균: %.1f\n", i + 1, classAvg);
            System.out.println("--------------------------------------");

        }

        double avg = (double) sum / student;

        System.out.println("\n==전교생==============================");
        System.out.println("전교생 수학 점수 총합: " + sum);
        System.out.printf("전교생 수학 점수 평균: %.1f", avg);
        System.out.println("\n======================================");
    }
}
