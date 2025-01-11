package a1121;

public class Dot1 {

    private static void printNumbers(int... numbers) {
    // 오 ㅋㅋ ...을 쓰면 일일이 매개변수를 안써줘도 되나봄.
    // 가변?

    for(int abc: numbers) {
        System.out.println();
        System.out.println(abc);
    }

    }




    public static void main(String[] args) {

                printNumbers(1, 2, 3);
                printNumbers(10, 20);
        
            
        
        }
}
