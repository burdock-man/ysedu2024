package a1111;

public class Long {
    public static void main(String[] args) {
        long var1 = 10; // 리터럴이 10진수의 허용범위에 있다면, long으로 선언해도 int로 간주한다.
        long var2 = 20L; // 마찬가지로 10진수의 허용범위에 있다면 L을 써도 그만 안써도 그만.
        // long var3 = 1000000000000; // 근데 10진수의 허용범위 외에 있는데 L을 붙이지 않는다면 에러.
        long var4 = 1000000000000L; // 10진수 허용범위 밖, 16진수 허용범위 안이라면 리터럴+L을 붙여 long변수를 선언한다.

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
