package a1112;

import java.util.Scanner;

public class Scan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x값 입력: ");
        int x = scanner.nextInt();

        System.out.println("y값 입력: ");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.println("x + y = " + result);

    }
}
