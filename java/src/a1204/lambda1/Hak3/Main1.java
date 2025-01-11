package a1204.lambda1.Hak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // 학생 수를 입력
        System.out.println("학생 수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        // 학생 정보 입력
        for (int i = 0; i < n; i++) {
            System.out.print("학생 이름: ");
            String name = sc.nextLine();
            System.out.print("학생 나이: ");
            int age = sc.nextInt();
            System.out.print("학생 학번: ");
            int studentId = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비
            students.add(new Student(name, age, studentId));
        }

        // 삽입 정렬 (람다식 사용)
        students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        // 정렬된 결과 출력
        System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int age;
    private int studentId;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }
}