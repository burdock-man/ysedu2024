package a1113;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("첫 번째 정수를 입력하세요: ");
        int x = scan.nextInt();
        System.out.println();

        System.out.print("두 번째 정수를 입력하세요: ");
        int y = scan.nextInt();
        System.out.println();

        // System.out.println(x + " + " + y + " = " + (x + y));
        // System.out.println(x + " - " + y + " = " + (x - y));
        // System.out.println(x + " × " + y + " = " + (x * y));
        // System.out.println(x + " ÷ " + y + " = " + (x / y));
        // System.out.println(x + " % " + y + " = " + (x % y));

        System.out.printf("%d + %d = %d\n",x , y, (x + y));
        System.out.printf("%d - %d = %d\n",x , y, (x - y));
        System.out.printf("%d × %d = %d\n",x , y, (x * y));
        System.out.printf("%d ÷ %d = %d\n",x , y, (x / y));
        System.out.printf("%d %% %d = %d\n",x , y, (x % y));

    }
}
