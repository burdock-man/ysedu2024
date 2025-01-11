package a1202.file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("newfile.txt");
            if(file.createNewFile()) {
                System.out.println("파일생성: " + file.getName());
            } else {
                System.out.println(file.getPath() + "<< 여기에 파일이 이미 존재하는디요?");
            }
        } catch (IOException e) {
            System.out.println("예외발생!!!!! " + e.getMessage() + "!!!!!!!!!!");
        }
    }
}
