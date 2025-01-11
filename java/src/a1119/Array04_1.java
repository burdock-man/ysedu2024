package a1119;

import java.util.Arrays;
import java.util.Random;

public class Array04_1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        // 랜덤한 숫자를 생성하는 클래스를 객체로 생성

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        } // 배열의 i번째 자리에 0~99 사이의 숫자를 입력

        // for (int num : numbers) {
        //     num = random.nextInt(100);
        // }

        System.out.println(Arrays.toString(numbers));


        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            max = Math.max(max, num);
            max = Math.max(min, num);
        }

        System.out.println("최댓값: " + max);
        System.out.println("최댓값: " + min);

    }
}