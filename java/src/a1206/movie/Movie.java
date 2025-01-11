package a1206.movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Movie {
    private long id;
    private String title; // 영화 제목
    private String genre; // 영화 장르
    
   
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
  
    private static final File file = new File("E:\\burdock-man\\web_02\\java\\movies.txt");
    public Movie(long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return String.format("[%d] : %s(%s)",id, title, genre);
    }

    public static ArrayList<Movie> findAll() throws IOException{
        ArrayList<Movie> movies = new ArrayList<Movie>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ( (line = br.readLine()) != null) { //파일을 한행씩 읽어와 반복 데이터 있을때까지
            String [] temp = line.split(","); //',' 기준으로 배열을 만듬
            Movie m = new Movie(
                Long.parseLong(temp[0]), //영화 대표값
                temp[1], // 영화 제목
                temp[2] // 영화 장르
            );
            movies.add(m);// 생성 영화 객체를 ArrayList에 추가
        }
        br.close(); // 파일 입력 흐름 해제
        return movies;//영화 객체가 담긴 ArrayList 반환
    }
    public static Movie findById(String movieIdStr) throws IOException{
      Movie movie = null;
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line = null; 
      while ( (line = br.readLine()) != null) { //파일을 한행씩 읽어와 반복 데이터 있을때까지
        String [] temp = line.split(","); //',' 기준으로 배열을 만듬
        if(movieIdStr.equals(temp[0])){ //영화 대표값을 찾으면 객체 생성
            movie = new Movie( Long.parseLong(temp[0]),temp[1],temp[2]);
            break; //반분문 탈출(다이상 찾지 않음)
        }
    }
    br.close(); // 파일 입력 흐름 해제

      return movie;
    }



}
