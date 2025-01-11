package a1119;

import java.util.Arrays;

public class Marray01 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행 3열 - 2차원
        // int arr[][] = new int[2][3]; // 변수에 달아도 됨.
        int num = 1;


        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = num;
                num++;
                System.out.println(arr[i][k] + "");
            }
        }
    }
}
