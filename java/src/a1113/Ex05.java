package a1113;

public class Ex05 {
    public static void main(String[] args) {
        // int a = 5;
        // if(a > 0) {
        //     int b = a * 2;
        // }
        // System.out.println(b); // b가 if 블록에 들어가있어서 인식이 안됨.

        int a = 5;
        int b = 0; // 초기값을 줘야함.
        if(a > 0) {
            b = a * 2;
        }
        System.out.println(b);

    }
}
