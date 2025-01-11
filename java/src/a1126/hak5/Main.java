package a1126.hak5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생의 이름을 입력하세요> ");
        String name = scanner.nextLine();
        System.out.print("학생의 학번을 입력하세요> ");
        String studentId = scanner.nextLine();
        System.out.print("학생의 성적을 입력하세요> ");
        int score = scanner.nextInt();

        Grade grade = new Grade(name, studentId, score);

        scanner.close();


    }
}
