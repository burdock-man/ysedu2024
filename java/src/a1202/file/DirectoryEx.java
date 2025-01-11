package a1202.file;

import java.io.File;

import a1122.final1;

public class DirectoryEx {
    public static void main(String[] args) {
        File directory = new File("d:\\BURDOCK-MAN\\web_02\\java\\testDir");

        if(directory.mkdir()) {
            System.out.println("디레ㅐㄱ토리가 생성되었씀당: " + directory.getName());
        } else {
            System.out.println("디렉토리 생성에 실패ㅔ했숨당;;");
        }

        // 디렉토리 내 파일 및 폴더 목록 출력
        File dir = new File(".");
        String[] list = dir.list();
        if (list != null) {
            System.out.println("디렉토리 목록: ");
            for (String FileName : list) {
                System.out.println(FileName);
            }
        }
    }
}
