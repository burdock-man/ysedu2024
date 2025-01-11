package a1202.hak5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    
    private ArrayList<StudentDTO> slist;
    Scanner scan = new Scanner(System.in);



    public StudentDAO(){ // 생성매서드

        slist = new ArrayList<StudentDTO>();
        // 기본데이터 - 4명의 더미데이터 생성
        StudentDTO s1 = new StudentDTO(0,"테스트1",11,100,90,80);
        StudentDTO s2 = new StudentDTO(1,"테스트2",22,90,89,91);
        StudentDTO s3 = new StudentDTO(2,"테스트3",33,85,77,55);
        StudentDTO s4 = new StudentDTO(3,"테스트4",44,77,68,85);
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
    }




    public void userInsert() {
        System.out.println("<학생 추가하기>");
        System.out.print("이름:");
        String name = scan.next();
        System.out.println("나이: ");
        int age = scan.nextInt();
        System.out.println("국어: ");
        int kor = scan.nextInt();
        System.out.println("영어: ");
        int eng = scan.nextInt();
        System.out.println("수학: ");
        int math = scan.nextInt();
        StudentDTO student = new StudentDTO(slist.size(), name, age, kor, eng, math);

        slist.add(student);
    }

    public void userDelete() {
        System.out.println("<학생정보 삭제>");
        System.out.println("학생의 ID를 입력하세요.");
        System.out.print(">>");
        int index = scan.nextInt();

        for(int i = 0; i < slist.size(); i++) {
            if (index == i) {
                slist.remove(i);
            } else if (index > slist.size() || index < 0) {
                System.out.println("찾는 학생이 없습니다.");
            }
        }

        // for(int i = 0; i < slist.size(); i++) slist.get(i).setId(i);

    }

    private int serchIndex() {
        int index = -1;
        System.out.println("학생 이름을 입력해 주세요");
        System.out.println(">>");
        String name = scan.next();

        for (int i = 0; i < slist.size(); i++) {
            if(slist.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;

    }




    public void userInfo() {
        System.out.println("<학생정보 보기>");
        System.out.println("학생의 ID를 입력하세요.");
        System.out.print(">>");
        int index = scan.nextInt();

        for(int i = 0; i < slist.size(); i++) {

            if (index == i) {
                System.out.println(slist.get(i));
            } else if (index > slist.size() || index < 0) {
                System.out.println("찾는 학생이 없습니다.");
            }

        }
    }




    public void userModify() {
        System.out.println("<학생정보 수정>");
        System.out.println("학생의 ID를 입력하세요.");
        System.out.print(">>");
        int index = scan.nextInt();

        for(int i = 0; i < slist.size(); i++) {

            if (index == i) {

                System.out.println(slist.get(i).getName() + "학생의 변경할 이름을 적어주세요");
                System.out.print(">>");
                String mName = scan.next();
                slist.get(i).setName(mName);

                System.out.println(slist.get(i).getName() + "학생의 변경할 나이를 적어주세요");
                System.out.print(">>");
                int mAge = scan.nextInt();
                slist.get(i).setAge(mAge);

                System.out.println(slist.get(i).getName() + "학생의 변경할 국어 점수를 적어주세요");
                System.out.print(">>");
                int mKor = scan.nextInt();
                slist.get(i).setKor(mKor);

                System.out.println(slist.get(i).getName() + "학생의 변경할 영어 점수를 적어주세요");
                System.out.print(">>");
                int mEng = scan.nextInt();
                slist.get(i).setEng(mEng);

                System.out.println(slist.get(i).getName() + "학생의 변경할 수학 점수를 적어주세요");
                System.out.print(">>");
                int mMath = scan.nextInt();
                slist.get(i).setMath(mMath);

                System.out.println("정보가 성공적으로 변경되었습니다.");

            } else if (index > slist.size() || index < 0) {
                System.out.println("찾는 학생이 없습니다.");
            }

        }
    }

    public void userList() {
        System.out.println("<학생목록 보기>");

        for(int i = 0; i < slist.size(); i++) {
                System.out.println(slist.get(i));
        }
    }




    public void userSave() {
        System.out.println("<파일로 저장하기>");
        try {
            File save = new File("e:/burdock-man/web_02/java/studentData.txt");
            if(save.createNewFile()) {
                System.out.println("파일생성 완료.");
            } else {
                System.out.println("파일수정 완료.");
            }
            PrintWriter pw = new PrintWriter("e:/burdock-man/web_02/java/studentData.txt");
            for(int i = 0; i < slist.size(); i++) {
                pw.println(slist.get(i));
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("예외발생!" + e.getMessage());
        }
    }




    public void userLoad() {
        System.out.println("<학생정보 파일 불러오기>");
        try {
            BufferedReader br = new BufferedReader(new FileReader("e:/burdock-man/web_02/java/studentData.txt"));
            while (true) {
                String line = br.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }

    }


}
