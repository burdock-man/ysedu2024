package a1112;

import java.util.Scanner;

public class Scan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("a값 입력: ");
        String a = scanner.nextLine(); // 얘는 문장(띄어쓰기같은거 다 포함해서)을 받음.

        System.out.print("b값 입력: ");
        String b = scanner.next(); // 얘는 단어(띄어쓰기쓰면 첫단어 뒤로는 생략됨)을 받음.

        System.out.println(a);
        System.out.println(b);

    }
}
