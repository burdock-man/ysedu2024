package a1203.hak5;

import java.io.File;

public class FileClass {
    private File file; // 자바에서 제공하는 파일 객체를 저장
    private String dir; // 디렉토리
    private String fileName; // 파일명

    public FileClass() {
        file = new File("e:\\burdock-man\\web_02\\java\\");
        // 기본 생성자. 기본 디렉토리를 e:\burdock-man\web_02\java\ 로 설정
    }

    public FileClass (String dir, String fileName) {
        file = new File("e:\\burdock-man\\web_02\\java\\" + dir + "\\" + fileName + ".txt");
        this.dir = "e:\\burdock-man\\web_02\\java\\" + dir;
        this.fileName = fileName + ".txt";
        // 디렉토리 경로와 파일 이름을 받아서 파일 객체를 초기화.
        // 디렉토리가 없는 경우 디렉토리도 생성.
    }
}
