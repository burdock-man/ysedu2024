package a1112;

import java.util.Scanner;

public class Scan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("a값 입력: ");
        String a = scanner.next();

        System.out.print("b값 입력: ");
        String b = scanner.next();

        String c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
        // System.out.println(b);

    }
}