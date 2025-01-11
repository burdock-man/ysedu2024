package a1111;

public class Var3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y); // 이 코드 그대로 두고, x값과 y값을 바꾼다 치면
                                                   // 그냥 x = y로 하면 안된다. y값이 x값을 내쫓아버리고 x, y 둘다 차지하기 때문.
        int temp = x; // temp변수를 만들어서 x값을 넣어준다. 즉, 둘의 위치를 옮기려면 원래 있던 x값이 잠깐 머물 방을 하나 만들어주는거다.
        x = y; // x값이 있던 방에 y값이 들어간다.
        y = temp; // 나와있던 x값이 y방으로 들어간다.
        System.out.println("x:" + x + ", y:" + y); // 두 값의 위치가 바꼈다. 둘의 위치를 옮기려면 3개의 방이 필요하다는걸 알아야함.
    }
}
