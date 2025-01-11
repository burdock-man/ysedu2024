package a1126.Doseo;

public class LibraryEx {
    public static void main(String[] args) {
        // EBook 객체생성
        EBook ebook = new EBook("고레가 자바다제!", "나훈아", "2015-1113", 5.6, "pdf");

        // PrintedBook 객체 생성
        PrintedBook ptbook = new PrintedBook("하지메테 데아우 리아쿠토", "남진", "2016-0124", 464, 0.8);

        System.out.println("EBook InformationL: ");
        ebook.displayInfo();

        System.out.println();
        System.out.println("Printed Book Information: ");
        ptbook.displayInfo();

    }
}
