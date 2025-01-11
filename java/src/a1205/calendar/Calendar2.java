package a1205.calendar;

import java.util.Calendar;

public class Calendar2 {
    public static void main(String[] args) {

        Calendar startData = Calendar.getInstance();
        startData.set(2025, Calendar.JANUARY, 1);

        Calendar endData = Calendar.getInstance();
        startData.set(2025, Calendar.DECEMBER, 31);

        long startMillis = startData.getTimeInMillis(); // 밀리초
        long endMillis = endData.getTimeInMillis(); // 밀리초
        long diff = startMillis - endMillis;
        long diffDays = diff / (24*60*60*1000);

        System.out.println("\n두 날짜의 차이는 " + diffDays + "일 입니다.");


    }
}
