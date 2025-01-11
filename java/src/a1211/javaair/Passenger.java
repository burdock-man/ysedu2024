package a1211.javaair;

import java.time.LocalDate;
import java.time.Period;

public class Passenger {
    // 예매정보 저장 - 나이검증 여기서함.
    private String name;
    private int birthDate; // 생년월일 831016
    private String pw; // 예약비밀번호
    private String seat; // 좌석

    public Passenger(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Passenger(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getBirthDate() {return birthDate;}
    public void setBirthDate(int birthDate) {this.birthDate = birthDate;}
    public String getPw() {return pw;}
    public void setPw(String pw) {this.pw = pw;}
    public String getSeat() {return seat;}
    public void setSeat(String seat) {this.seat = seat;}


    // 15세 이상만 국제선 예약 가능하도록
    public boolean man15(Passenger p) { //예를들어 831016
        int y = p.birthDate / 10000; // 83.1016 -> 83 (83년)
        int m = (p.birthDate % 10000) / 100; // (831016 % 10000) / 100 -> 1016 / 100 -> 10 (10월)
        int d = p.birthDate % 100; // 831016 % 100 -> 16 (16일)

        if (y > 0 && y <= 24) {
            y = y + 2000;
        } else {
            y += 1900;
        }
        // 1983/10/16;
        LocalDate birthDate2 = LocalDate.of(y,m,d);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate2, currentDate).getYears(); // 두 연도간의 차이
        // Period.between(birthDate2, currentDate).getDays() // 두 날짜간의 차이

        return age > 15;
    }



}
