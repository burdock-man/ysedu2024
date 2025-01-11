package a1120;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {

        // Week 열거 타입 변수 선언
        Week today = null;

        Calendar cal = Calendar.getInstance();

        // 오늘의 요일 얻기 (1~7) 일:1 월:2 화:3 ....
        int week = cal.get(Calendar.DAY_OF_WEEK);


        switch(week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }
        // 열거 타입 변수를 사용
        if (today == Week.SUNDAY) {
            System.out.println("축구");
        } else {
            System.out.println("자바 공부");
        }

        System.out.println("요일: \"" + week + "\"");

    }
}
