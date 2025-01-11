package a1202.bookstore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {

    Scanner scan = new Scanner(System.in);

    private ArrayList<BookDTO> books = new ArrayList<>();

    public BookDAO() {
        books.add(new BookDTO(1, "Java Programming", "Author A", 2020));
        books.add(new BookDTO(2, "Python Basics", "Author B", 2019));
        books.add(new BookDTO(3, "Data Structures", "Author C", 2018));
    }

    public void bookList() {
        System.out.println("\n<도서 목록>");
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public void bookSearch() {
        boolean found = false;
        System.out.println("\n<도서 검색>");
        System.out.println("검색 키워드를 입력하세요.");
        System.out.print(">> ");
        String keyword = scan.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().contains(keyword)) {
                System.out.println(books.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void bookInsert() {
        System.out.println("\n<도서 추가>");
        System.out.println("추가하는 책의 제목을 입력하세요.");
        System.out.print(">> ");
        String newTitle = scan.nextLine();
        System.out.println("추가하는 책의 저자를 입력하세요.");
        System.out.print(">> ");
        String newAuthor = scan.nextLine();
        System.out.println("추가하는 책의 출판연도를 입력하세요.");
        System.out.print(">> ");
        int newYear = Integer.parseInt(scan.nextLine());
        BookDTO newBook = new BookDTO(books.size()+1, newTitle, newAuthor, newYear);
        books.add(newBook);
    }

    public void bookDelete() {
        boolean found = false;
        System.out.println("\n<도서 삭제>");
        System.out.println("삭제할 책의 번호를 입력하세요.");
        System.out.print(">> ");
        try {
            int deleteID = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < books.size(); i++) {
                if (deleteID == books.get(i).getId()){
                    System.out.println(books.get(i).getId() + "번 책이 삭제되었습니다.");
                    books.remove(i);
                    found = true;
                }
                books.get(i).setId(i + 1);
            }
            if (!found) {
                System.out.println("해당하는 책의 번호가 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("\n*** 오류 : 잘못된 입력입니다. (" + e.getMessage() + ") ***");
        }
    }

    public void bookModify() {
        boolean found = false;
        System.out.println("\n<도서 수정>");
        System.out.println("수정할 책의 번호를 입력하세요.");
        System.out.print(">> ");
        try {
            int modifyID = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < books.size(); i++) {
                if (modifyID == books.get(i).getId()){
                    System.out.println("책의 수정할 제목을 입력해 주세요.");
                    System.out.print(">> ");
                    books.get(i).setTitle(scan.nextLine());
                    System.out.println("책의 수정할 저자를 입력해 주세요.");
                    System.out.print(">> ");
                    books.get(i).setAuthor(scan.nextLine());
                    System.out.println("책의 수정할 출판연도을 입력해 주세요.");
                    System.out.print(">> ");
                    books.get(i).setYear(Integer.parseInt(scan.nextLine()));
                    System.out.println(books.get(i).getId() + "번 책이 수정되었습니다.");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("해당하는 책의 번호가 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("\n*** 오류 : 잘못된 입력입니다. (" + e.getMessage() + ") ***");
        }
    }

    public void dataSave() {
        System.out.println("\n<정보 저장>");
        try {
            File save = new File("e:/burdock-man/web_02/java/bookData.txt");
            if(save.createNewFile()) {
                System.out.println("파일생성 완료.");
            } else {
                System.out.println("파일수정 완료.");
            }
            PrintWriter pw = new PrintWriter("e:/burdock-man/web_02/java/bookData.txt");
            for(int i = 0; i < books.size(); i++) {
                pw.println(books.get(i));
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("\n*** 오류 : 예외 발생 (" + e.getMessage() + ") ***");
        }
    }

    public void dataLoad() {
                System.out.println("\n<정보 불러오기>");
        try {
            BufferedReader br = new BufferedReader(new FileReader("e:/burdock-man/web_02/java/bookData.txt"));
            while (true) {
                String line = br.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("\n*** 오류 : 파일 읽기 실패 (" + e.getMessage() + ") ***");
        }
    }

}
