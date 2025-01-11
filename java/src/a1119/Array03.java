package a1119;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("배열의 크기를 입력하세요: ");
        int arr = scan.nextInt();
        System.out.println();

        int[] input = new int[arr];
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.print((i + 1) + "번째 정수를 입력하세요: ");
            input[i] = scan.nextInt();
            sum += input[i];
        }

        double avg = (double) sum / input.length;

        System.out.println();
        // System.out.println(input); // 이걸 출력하면 [I@723279cf 이런식으로 나오는데, 이게 주소임 ㅇㅇ
        System.out.println("배열: " + Arrays.toString(input));
        System.out.println("배열의 합: " + sum);
        System.out.printf("배열의 평균: %.1f \n", avg);

    }
}
