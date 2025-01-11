package a1118;

public class IndexOf1 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍"); // subject에서 "프로그래밍"이 어디서부터 시작되느냐
        System.out.println();
        System.out.println(location); // 3

        String subString = subject.substring(location); // 인덱스번호 location부터 끝가지 문자열 추출해서 subString변수에 느라.
        System.out.println(subString);

        location = subject.indexOf("삥뿅"); // 만약 "자바"라는 텍스트가 없으면 -1이 추출됨.
        if(location != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련되지 않은 책이군요");
        }

        boolean result = subject.contains("자바"); // 만약 "자바"라는 텍스트가 있으면 true로 반환됨.
        if(result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련되지 않은 책이군요");
        }
    }
}
