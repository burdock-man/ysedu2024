package a1202.exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception4 {
    public static void main(String[] args) {

        // 파일 입출력
        // 파일이 존재하지 않거나 읽기/쓰기 권한이 없을 때 발생하는 예외

        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch(IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했씀둥!");
        }
    }
}
