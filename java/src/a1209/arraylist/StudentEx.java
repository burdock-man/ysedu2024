package a1209.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 19, "S003"));

        Student s4 = new Student(); // 나는 이 규격 만들어놨었음 ㅋㅋ;

        s4.setName("Tom");
        s4.setAge(22);
        s4.setId("S004");

        students.add(s4);

        System.out.println("");

        while (true) {
            System.out.println("┌──────────────────────────┐");
            System.out.println("│    학생 관리 프로그램    │");
            System.out.println("├──────────────────────────┤");
            System.out.println("│ 1. 학생정보 추가         │");
            System.out.println("│ 2. 학생목록 보기         │");
            System.out.println("│ 3. 학생정보 수정         │");
            System.out.println("│ 4. 학생정보 삭제         │");
            System.out.println("│ 5. 프로그램 종료         │");
            System.out.println("├──────────────────────────┤");
            System.out.print("│ 업무를 선택하세요>> ");
            try {
                int select = scan.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 1. 학생정보 추가         │");
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 추가할 학생의 이름       │");
                        System.out.println("├──────────────────────────┤");
                        System.out.print("│ 이름>> ");
                        String n = scan.next();
                        scan.nextLine();
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 추가할 학생의 나이       │");
                        System.out.println("├──────────────────────────┤");
                        System.out.print("│ 나이>> ");
                        int a = scan.nextInt();
                        scan.nextLine();
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 추가할 학생의 아이디     │");
                        System.out.println("├──────────────────────────┤");
                        System.out.print("│ 아이디>> ");
                        String i = scan.nextLine();
                        students.add(new Student(n, a, i));
                        System.out.println("│ 새로운 학생이 추가됨.    │");
                        System.out.println("└──────────────────────────┘");

                        // ***********************************************************
                        // Student s5 = new Student(); // 이렇게 빈 규격을 만들어놓고
                        // s5.setName(scan.nextLine());
                        // s5.setAge(scan.nextInt());
                        // s5.getId(scan.nextLine());
                        // 이렇게 써도 되긴 함.
                        // ***********************************************************

                        continue;
                    case 2:
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 2. 학생목록 보기         │");
                        System.out.println("├──────────────────────────┤");

                        if(students.isEmpty()) { // 학생 리스트 없으먼
                            System.out.println("│ 학생 데이터가 없습니다.  │");
                        } else {
                            for(Student student : students) {
                                System.out.println(student);
                            }
                            System.out.println("└──────────────────────────┘");
                        }
                        continue;
                    case 3:
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 3. 학생정보 수정         │");
                        System.out.println("├──────────────────────────┤");

                        System.out.println("│ 수정할 학생의 아이디     │");
                        System.out.print("│ 아이디>> ");
                        String mi = scan.next();
                        scan.nextLine();
                        boolean found = false;
                        for(Student student : students) {
                                if(student.getId().equalsIgnoreCase(mi)) {
                                    System.out.println("│ 수정할 학생의 이름       │");
                                    System.out.print("│ 이름>> ");
                                    student.setName(scan.next());
                                    scan.nextLine();
                                    System.out.println("│ 수정할 학생의 나이       │");
                                    System.out.print("│ 나이>> ");
                                    student.setAge(scan.nextInt());
                                    scan.nextLine();
                                    System.out.println("│ 학생 정보 수정됨.        │");
                                    System.out.println("└──────────────────────────┘");
                                    found = true;
                                    break;
                            }
                        }
                        if(!found) {
                            System.out.println("│ 학생 데이터가 없습니다.  │");
                            System.out.println("└──────────────────────────┘");
                        }
                        continue;
                    case 4:
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 4. 학생정보 삭제         │");
                        System.out.println("├──────────────────────────┤");

                        System.out.println("│ 삭제할 학생의 아이디     │");
                        System.out.print("│ 아이디>> ");
                        String di = scan.next();
                        scan.nextLine();
                        found = false;
                        for(Student student : students) {
                                if(student.getId().equalsIgnoreCase(di)) {
                                    students.remove(student);
                                    found = true;
                                    System.out.println("│ 학생 정보 삭제됨.        │");
                                    System.out.println("└──────────────────────────┘");
                                    break;
                            }
                        }
                        if(!found) {
                            System.out.println("│ 학생 데이터가 없습니다.  │");
                            System.out.println("└──────────────────────────┘");
                        }
                        continue;
                    case 5:
                        System.out.println("├──────────────────────────┤");
                        System.out.println("│ 5. 프로그램 종료         │");
                        System.out.println("└──────────────────────────┘");
                        scan.close();
                        return;
                
                    default:
                        scan.nextLine();
                        System.out.println("│ 잘못된 선택입니다.       │");
                        System.out.println("└──────────────────────────┘");
                        break;
                }
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("│ 잘못된 선택입니다.       │");
                System.out.println("└──────────────────────────┘");
                continue;
            }


            break;
        }

        // System.out.println(">>>>>> " + students.size());
    }
}
