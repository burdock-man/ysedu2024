package a1118;

public class String1 {
    public static void main(String[] args) {
        // string은 참조 타입. // [교과서 156페이지 참고할것]
        // "Hello"를 a라는 변수안에 집어넣으면 a = "Hello"로 직역되지 않고
        // a = 주소 --------> 주소 : "Hello" 식으로 참조해오는거 ㅇㅇ
        
        String a = "Hello";  // 단, 변수에 문자열 리터럴로 넣으면
        String b = "Java";
        String c = "Hello";  // 같은 문자열을 넣었을때 a == c 가 성립이 되지만, (번지값이 같음.)

        String d = new String("Hello"); // new 연산자로 생성하면 새로운 주소값이 부여되는거라서
        String e = new String("Java"); // a != d 이다.
        String f = new String("Java");

        System.out.println();
        System.out.println(a == c); // true
        System.out.println(a == d); // false
        System.out.println(a.equals(d)); // true // ㅋㅋ??

        System.out.println(e == f); // false // e랑 f는 다른 주소값을 받음
        System.out.println(e.equals(f)); // true
        System.out.println(b.equals(e)); // true

        // == : 해당 변수의 레퍼런스(참조 정보)를 비교
        // equals() : 해당 변수의 문자열 자체를 비교

    }
}
