package a1122.homework;

import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student s1 = new Student("홍길동", 87, 62, 81);
        Student s2 = new Student("김철수", 77, 54, 68);
        Student s3 = new Student("이영희", 90, 96, 89);
        Student s4 = new Student("곽두칠", 12, 23, 34);

        Student[] sArr = {s1, s2, s3, s4};

        System.out.println();

        while (true) {

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("|                                  진행하실 업무를 선택하세요.                                     |");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("|  1. 학생정보열람   |   2. 학생정보수정   |   3. 학생정보생성   |   4. 학생정보삭제   |  5. 종료  |");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.printf("| 선택> ");
            int select = scan.nextInt();

            if (select == 1) {
                Student.sInfo(sArr);
                Student.sAvg();
            } else if (select == 2) {
                Student.sInfo(sArr);
                System.out.println("|                                                                                                  |");
                System.out.println("| 수정할 학생 선택                                                                                 |");
                System.out.printf("| 리스트 번호> ");
                int modSelect = scan.nextInt();
                scan.nextLine(); // 개행문자 제거? 이걸 해야 다음 문자를 받을수 있나보다.

                if (modSelect < 1 || modSelect > sArr.length) {
                    System.out.println("|                                                                                                  |");
                    System.out.printf("| 잘못된 리스트 번호입니다. 1부터 %d까지의 리스트 번호를 입력해 주세요.                             |\n", sArr.length);
                    System.out.println("|                                                                                                  |");
                    continue;
                }

                System.out.println("|                                                                                                  |");
                System.out.printf("| 수정할 학생의 이름을 입력해 주세요. (현재 이름: %s)                                          |\n", sArr[modSelect-1].getName());
                System.out.print("| 이름> ");

                String modName = scan.nextLine();
                sArr[modSelect-1].setName(modName);

                System.out.println("|                                                                                                  |");
                System.out.printf("| 수정할 학생의 국어 성적을 입력해 주세요. (현재 국어 성적: %3s)                                   |\n", sArr[modSelect-1].getKoreanScore());
                System.out.print("| 국어성적> ");
                int modKorean = scan.nextInt();
                if (modKorean >= 0 && modKorean <= 100) {
                    sArr[modSelect-1].setKoreanScore(modKorean);
                } else {
                    System.out.println("|                                                                                                  |");
                    System.out.println("| 잘못된 성적입니다. 1부터 100까지의 성적을 입력해 주세요. 현재 국어점수는 0점으로 처리됩니다.     |");
                    System.out.println("|                                                                                                  |");
                    sArr[modSelect-1].setKoreanScore(0);
                }

                System.out.println("|                                                                                                  |");
                System.out.printf("| 수정할 학생의 영어 성적을 입력해 주세요. (현재 영어 성적: %3s)                                   |\n", sArr[modSelect-1].getEnglishScore());
                System.out.print("| 영어성적> ");
                int modEnglish = scan.nextInt();
                if (modEnglish >= 0 && modEnglish <= 100) {
                    sArr[modSelect-1].setEnglishScore(modEnglish);
                } else {
                    System.out.println("|                                                                                                  |");
                    System.out.println("| 잘못된 성적입니다. 1부터 100까지의 성적을 입력해 주세요. 현재 영어점수는 0점으로 처리됩니다.     |");
                    System.out.println("|                                                                                                  |");
                    sArr[modSelect-1].setEnglishScore(0);
                }

                System.out.println("|                                                                                                  |");
                System.out.printf("| 수정할 학생의 수학 성적을 입력해 주세요. (현재 수학 성적: %3s)                                   |\n", sArr[modSelect-1].getMathScore());
                System.out.print("| 수학성적> ");
                int modMath = scan.nextInt();
                if (modMath >= 0 && modMath <= 100) {
                    sArr[modSelect-1].setMathScore(modMath);
                } else {
                    System.out.println("|                                                                                                  |");
                    System.out.println("| 잘못된 성적입니다. 1부터 100까지의 성적을 입력해 주세요. 현재 수학점수는 0점으로 처리됩니다.     |");
                    System.out.println("|                                                                                                  |");
                    sArr[modSelect-1].setMathScore(0);
                }

                System.out.println("|                                                                                                  |");

            } else if (select == 3) {
                
                scan.nextLine(); // 개행문자 제거

                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                System.out.println("|                                                                                                  |");
                System.out.println("| 생성할 학생의 이름을 입력해 주세요.                                                              |");
                System.out.print("| 이름> ");
                String newName = scan.nextLine();

                System.out.println("|                                                                                                  |");
                System.out.println("| 생성할 학생의 국어 성적을 입력해 주세요.                                                         |");
                System.out.print("| 국어성적> ");
                int newKorean = scan.nextInt();

                System.out.println("|                                                                                                  |");
                System.out.println("| 생성할 학생의 영어 성적을 입력해 주세요.                                                         |");
                System.out.print("| 영어성적> ");
                int newEnglish = scan.nextInt();

                System.out.println("|                                                                                                  |");
                System.out.println("| 생성할 학생의 수학 성적을 입력해 주세요.                                                         |");
                System.out.print("| 수학성적> ");
                int newMath = scan.nextInt();

                Student[] newArr = new Student[sArr.length + 1]; // 크기 증가
                for (int i = 0; i < sArr.length; i++) {
                    newArr[i] = sArr[i];
                }

                newArr[sArr.length] = new Student(newName, newKorean, newEnglish, newMath);
                sArr = newArr;

                System.out.println("|                                                                                                  |");
                System.out.println("| 새로운 학생이 추가되었습니다.                                                                  |");
                System.out.println("|                                                                                                  |");

            } else if (select == 4) {

                Student.sInfo(sArr);
                System.out.println("|                                                                                                  |");
                System.out.println("| 삭제할 학생 선택                                                                                 |");
                System.out.printf("| 리스트 번호> ");
                int delSelect = scan.nextInt();

                if (delSelect < 1 || delSelect > sArr.length) {
                    System.out.println("|                                                                                                  |");
                    System.out.printf("| 잘못된 리스트 번호입니다. 1부터 %d까지의 리스트 번호를 입력해 주세요.                             |\n", sArr.length);
                    System.out.println("|                                                                                                  |");
                    continue;
                }

                Student.setTotalKorean(Student.getTotalKorean() - sArr[delSelect - 1].getKoreanScore());
                Student.setTotalEnglish(Student.getTotalEnglish() - sArr[delSelect - 1].getEnglishScore());
                Student.setTotalMath(Student.getTotalMath() - sArr[delSelect - 1].getMathScore());


                Student.setTotalStudent(Student.getTotalStudent() - 1);

                System.out.println("|                                                                                                  |");
                System.out.println("| 선택한 학생이 삭제되었습니다.                                                                  |");
                System.out.println("|                                                                                                  |");

                Student[] newArr = new Student[sArr.length - 1];
                int newIdx = 0;
                for (int i = 0; i < sArr.length; i++) {
                    if (i != delSelect - 1) {
                        newArr[newIdx++] = sArr[i];
                    }
                }

                sArr = newArr;

                Student.resetNumbers(sArr);

                
            } else if (select == 5) {
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                System.out.println("|                                                                                                  |");
                System.out.println("| 프로그램 종료                                                                                    |");
                System.out.println("|                                                                                                  |");
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                break;
            } else {
                System.out.println("|                                                                                                  |");
                System.out.println(                                                                                                                                                                                                                                                                                                                                                                                                                                                                               "| 잘못된 번호입니다. 1부터 5까지의 번호를 입력해 주세요.                                           |");
                System.out.println("|                                                                                                  |");
            }









        }
    }
}
