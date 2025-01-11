package a1119;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("모든 요소의 합: " + sum);
    }
}
