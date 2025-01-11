package a1121.anC2;

public class Student {
    // 학생의 속성 : 이름, 나이, 학번, 전공

    // 변수 선언 == 필드 선언

    String name;
    int age;
    String stdNo;
    String major;

    // 기본 생성자

    public Student() {
        this("이름없음", 0, "00000000", "없음");
    }

    public Student(String name, int age, String stdNo, String major) {
        this.name = name;
        this.age = age;
        this.stdNo = stdNo;
        this.major = major;
    }

    //                       ↓ 이놈은 "오징어"라는 스트링을 받는거임. 매개변수는 암꺼나 써도됨
    public void study(String subject) {
        System.out.println(subject + "를 공부합니다.");
        // 반환타입이 void면 return을 생략 가능
    }

    // 성적 평균 구하기
    public double getAverage(int score1, int score2) {
        double average = (double) (score1 + score2) / 2;
        return average;
    }

    public double getAverage(int score1, int score2, int score3) {
        double average = (double) (score1 + score2) / 3;
        return average;
    }

    public double getAverage(int[] scores) {
        double aveage = 0.0;
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        aveage = (double) sum / scores.length;
        return aveage;
    }

}
