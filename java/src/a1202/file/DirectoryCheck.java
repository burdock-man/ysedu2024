package a1202.file;

import java.io.File;

public class DirectoryCheck {
    public static void main(String[] args) {
        File dir = new File("testDir");
        if(dir.exists() && dir.isDirectory()) {
            String[] list = dir.list();
            if(list != null) {
                for(String fileName : list) {
                    File file = new File(dir, fileName);
                    if(file.isFile()) {
                        System.out.println("파일: " + fileName);
                    } else if(file.isDirectory()) {
                        System.out.println("디렉또리: " + fileName);
                    }
                }
            } else {
                System.out.println("디러ㅔㄱ토리가 존재하지 않습닏아.");
            }
        }
    }
}
