package a1202.file;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) {
        try {
            File file = new File("c:\\abc\\newfile.txt");
            if(file.createNewFile()) {
                System.out.println("파일생성: " + file.getName());
            } else {
                System.out.println(file.getPath() + "<< 여기에 파일이 이미 존재하는디요?");
            }

            // 파일 삭제

            if(file.delete()) {
                System.out.println("근데 삭제했슴다 ㅋㅋ!");
            } else {
                System.out.println("삭제할 파일이 없는디요?");
            }

        } catch (IOException e) {
            System.out.println("예외발생!!!!! " + e.getMessage() + "!!!!!!!!!!");
        }
    }
}
