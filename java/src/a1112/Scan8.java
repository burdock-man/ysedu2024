package a1112;

import java.util.Scanner;

public class Scan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("a값 입력: ");
        int a = scanner.nextInt();

        System.out.print("b값 입력: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println(a + " : " + b);
        // System.out.println(b);

    }
}