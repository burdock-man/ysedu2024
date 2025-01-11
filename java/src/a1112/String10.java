package a1112;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("입력예시: ");
        float a = scan.nextFloat();

        System.out.printf("출력예시: %06.2f", a);
    }
}
