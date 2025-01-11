package a1202.file2;

import java.io.IOException;
import java.io.InputStream;

public class Input {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // System.in == 키보드로 입력 받겠다.
        // InputStream read 메서드는 1byte 크기의 사용자 입력을 받아들인다.(한글은 안된다.)
        // 근데 int값으로 받아들임.
        int a;
        a = in.read();
        System.out.println(a);
        //사용자가 입력한 문자인 a에 해당하는 아스키코드 97출력
        //InputStream 은 바이트 단위의 데이터를 읽어들이는 내장 클래스
        //1byte만 읽으므로 한글자만 입력
    }
}
