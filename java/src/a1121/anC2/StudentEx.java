package a1121.anC2;

public class StudentEx {
    public static void main(String[] args) {
        
        // Student 객체 생성

        Student st1 = new Student();
        st1.name = "곽두칠";
        st1.age = 98;
        st1.stdNo = "12345678";
        st1.major = "오징어심리학과";

        Student st2 = new Student("조상팔", 90, "87654321", "비료창작과");

        int[] score = {10, 20, 30, 40, 50};

        System.out.println("\n#### 학생1 ####");
        System.out.println("학생1 - 이름 > " + st1.name);
        System.out.println("학생1 - 나이 > " + st1.age);
        System.out.println("학생1 - 학번 > " + st1.stdNo);
        System.out.println("학생1 - 전공 > " + st1.major);

        st1.study("오징어");

        System.out.println("학생1 - 중간고사 점수 > " + st1.getAverage(10, 20));
        System.out.println("학생1 - 기말고사 점수 > " + st1.getAverage(30, 40, 50));
        System.out.println("학생1 - 최종점수 > " + st1.getAverage(score));

        System.out.println("\n#### 학생2 ####");
        System.out.println("학생2 - 이름 > " + st2.name);
        System.out.println("학생2 - 나이 > " + st2.age);
        System.out.println("학생2 - 학번 > " + st2.stdNo);
        System.out.println("학생2 - 전공 > " + st2.major);

        st2.study("똥");

        System.out.println("학생2 - 중간고사 점수 > " + st2.getAverage(20, 70));
        System.out.println("학생2 - 기말고사 점수 > " + st2.getAverage(80, 70, 90));
        System.out.println("학생2 - 최종점수 > " + st2.getAverage(score));



    }
}
