package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= x; i++) {
            sum += i;
        }

        System.out.println("1부터 " + x + "까지 합은 " + sum + "입니다.");

    }
}

// 1 2 3 4 5 6 7 8 9 10