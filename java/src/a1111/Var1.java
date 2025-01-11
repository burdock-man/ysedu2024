package a1111;

public class Var1 {
    public static void main(String[] args) {
        int value = 0; // 그냥 int value; 를 해버리면 뭔값인지 모르기 때문에 =0를 넣어 초기화를 해줘야함.
        int result = value + 10; // result를 초기화 안해주는 이유는, 값+값 = 결과 <<이놈이 선언되는거임
        System.out.println(result);
    }
}
