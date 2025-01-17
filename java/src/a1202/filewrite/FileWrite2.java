package a1202.filewrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/abc/out.txt");

        for(int i = 1; i < 11; i++) {
            String data = i + " 번째 줄\r\n";
            output.write(data.getBytes());
        }
        output.close();
    }
}
// OutputStream 은 InputStram과 마찬가지로 byte 단위로 데이터 처리
// FileOutputStream은 OutputStream 클래스를 상속받아 역시 byte단위로 데이터 처리
// FileOutputStream은 byte 단위로 처리해야 하므로
// String -> byte 배열로 바꾸어주는 getByte() 메서드를 이용
// \r\n은 줄바꿈문자.
// 유닉스 \n만 있으면 되지만 윈도우에선 \r\n으로 작성해야
// 노트패드 같은 에디터에서 줄바꿈이 제대로 표시된다.
