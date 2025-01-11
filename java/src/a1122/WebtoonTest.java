package a1122;

public class WebtoonTest {
    public static void main(String[] args) {

        Webtoon wt1 = new Webtoon("나 혼자만 레벨업업", "판타지", "추공님");
        Webtoon wt2 = new Webtoon("스위트 집", "스릴러", "칸비님");
        Webtoon wt3 = new Webtoon("이태원 클래식", "드라마", "광진님");

        Webtoon[] wtArr = {wt1, wt2, wt3}; // 이 배열은 객체만 저장 가능.

        for (int i = 0; i < wtArr.length; i++) {
            System.out.println();
            System.out.println(wtArr[i].toStr());
            System.out.println();
        }

        System.out.printf("웹툰 객체의 총 수: %d",Webtoon.getCount());

    }

}

class Webtoon {

    private String title;
    private String genre;
    private String auther;

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Webtoon(String title, String genre, String auther) {
        this.title = title;
        this.genre = genre;
        this.auther = auther;
        Webtoon.count++;
    }

    public String toStr() {
        return String.format("Webtoon {title: %s, genre: %s, author: %s}", title, genre, auther);
    }

}
