package a1202.bookstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookDAO content = new BookDAO();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 도서 목록");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 추가");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 수정");
            System.out.println("6. 정보 저장");
            System.out.println("7. 정보 불러오기");
            System.out.println("0. 프로그램 종료\n");
            System.out.println("진행할 업무를 선택하세요.");
            System.out.print(">> ");
            try {
                int select = scan.nextInt();
                if (select == 1) {
                    content.bookList();
                } else if (select == 2) {
                    content.bookSearch();
                } else if (select == 3) {
                    content.bookInsert();
                } else if (select == 4) {
                    content.bookDelete();
                } else if (select == 5) {
                    content.bookModify();
                } else if (select == 6) {
                    content.dataSave();
                } else if (select == 7) {
                    content.dataLoad();
                } else if (select == 0) {
                    System.out.println("\n<프로그램 종료>");
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n*** 오류 : 다시 선택해 주세요 (" + e.getMessage() + ") ***");
                scan.nextLine();
                continue;
            }
        }
    }
}
