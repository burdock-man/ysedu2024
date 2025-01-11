package a1206.movie;

import java.io.File;
import java.util.ArrayList;

public class Reservation {
    private long id; //발급번호
    private long movieId; // 영화 대푯값
    private String movieTitle; // 영화 제목
    private String seatName; // 좌석명
   
    
    public long getId() {
        return id;
    }
    public long getMovieId() {
        return movieId;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getSeatName() {
        return seatName;
    }

     private static final File file = new File("E:\\burdock-man\\web_02\\java\\movies.txt");
    public Reservation(long id, long movieId, String movieTitle, String seatName) {
        this.id = id;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }
    public String toString() {
        return String.format("영화: %s, 좌석: %s", movieTitle, seatName);
    }
    public static ArrayList<Reservation> findById(String movieIdStr) {

    }

}
