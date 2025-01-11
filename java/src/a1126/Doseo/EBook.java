package a1126.Doseo;

public class EBook extends Book{
    private double fileSize; // 파일 크기(mb)
    private String format; // 파일포맷(예 : exe, pdff)

    public double getFileSize() {return fileSize;}
    public void setFileSize(double fileSize) {this.fileSize = fileSize;}

    public String getFormat() {return format;}
    public void setFormat(String format) {this.format = format;}

    public EBook(String title, String author, String ISBN, double fileSize, String format) {
        super(title, author, ISBN); // 부모(Book) 클래스 생성자 호쭐
        this.fileSize = fileSize;
        this.format = format;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("file size: " + fileSize + "MB");
        System.out.println("Format: " + format);
    }

}
