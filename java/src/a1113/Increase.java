package a1113;

public class Increase {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // x = x + 1; // 11
        ++x; // 12
        System.out.println();
        System.out.println("x= " + x);
        System.out.println();

        y--;
        --y;
        System.out.println("y= " + y);
        System.out.println();

        z = x++;
        System.out.println("z= " + z); // 12 // 12가 나오는 이유는, x++;에서, 피연산자(x)가 연산자(++) 앞에있을 때 계산식이 조금 특이함.
        System.out.println("x= " + x); // 13 // (피연산자) + (연산자) = z에 대입을 먼저 하고 연산함.
        System.out.println();

        z = ++x;
        System.out.println("z= " + z); // 14 // (연산자) + (피연산자) = 현재 연산을 먼저 마치고 z에 대입함.
        System.out.println("x= " + x); // 14
        System.out.println();

        z = ++x + y++;
        System.out.println("z= " + z); // 15 + 8(+1은 아직 연산 안됨) = 23
        System.out.println("x= " + x); // 15
        System.out.println("y= " + y); // 9
        System.out.println();
    }
}
