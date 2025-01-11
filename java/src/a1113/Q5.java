package a1113;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("몇단? : ");
        int x = scan.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(x + " × " + i + " = " + (x * i));
        }


    }
}

// 1 2 3 4 5 6 7 8 9 10