package a1113;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("정수를 입력하세요: ");
        int x = scan.nextInt();
        System.out.println();

        if ((x % 2) == 1) {
            System.out.println(x + "는 홀수임당");
        } else if (x == 0) {
            System.out.println("0은 신사임당");
        } else {
            System.out.println(x + "는 짝수임당");
        }

    }
}
