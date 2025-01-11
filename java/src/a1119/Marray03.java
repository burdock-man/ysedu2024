package a1119;

import java.util.Arrays;
import java.util.Scanner;

public class Marray03 {
    public static void main(String[] args) {
        // 비정방 행렬 배열
        // [][]
        // [][][][]
        // [][][]

        int a[][] = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.printf("\n==================== %d행 ====================\n", i + 1);
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d열에 들어갈 정수를 입력해 주세요: ", i + 1, j + 1);
                a[i][j] = scan.nextInt();
            }
            System.out.println("\n" + Arrays.toString(a[i]));
            System.out.println("=============================================\n");
        }
    }
}
