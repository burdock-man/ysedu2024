package a1202.file;

import java.io.File;

public class FileEx01 {
    public static void main(String[] args) {
        
        // file 객체생성
        File file = new File("c:\\abc\\out1.txt"); //디렉토리 찾을때 역슬래쉬 \\ 두개쓰는게 예의임. 동방예의지국이니까 지켜야됨.

        if(file.exists()) {
            System.out.println("파일이름: " + file.getName());
            System.out.println("파일경로: " + file.getPath());
            System.out.println("파일크기: " + file.length() + "바이트");
            System.out.println("읽기가능: " + file.canRead());
            System.out.println("쓰기가능: " + file.canWrite());
        } else {
            System.out.println("파일이 존재하지 않는디요?");
        }

    }
}
