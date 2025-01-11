package a1202.filewrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite4_1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/abc/out3.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번쩬장 난 네가 좋다!"; 
            pw.println(data); // PrintWriter는 println을 사용할수 있기 때문에 \r\n 안써도됨
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/abc/out3.txt"), true);
        for(int i=21; i<31; i++) {
            String data = i + " 번째 줄임둥.";
            pw2.println(data);
        }
        pw.close();
    }
}