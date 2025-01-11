package a1202.bookstore;

public class BookDTO {

    private int id;
    private String title;
    private String author;
    private int year;

    public int getId() {return 2000 + id;}
    public void setId(int id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public BookDTO() {}

    public BookDTO(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[책 번호 = " + (2000 + id) + " / 책 제목 = " + title + " / 책 저자 = " + author + " / 출판연도 = " + year + "]";
    }

}
