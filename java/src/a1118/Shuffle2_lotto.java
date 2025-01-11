package a1118;

import java.util.Arrays;

public class Shuffle2_lotto {
    public static void main(String[] args) {

        int[] ball = new int[45];
        int n = 0;
        int tmp = 0;

        for(int i = 0; i < 45; i++) {
            ball[i] = i+1;
        }

        System.out.println();
        System.out.println(Arrays.toString(ball));

        for(int i = 0; i < 1000; i++) {
            n = (int) (Math.random() * 45);
            tmp = ball[0];
            ball[0] = ball[n];
            ball[n] = tmp;
        }

        System.out.println();
        System.out.println(Arrays.toString(ball));
        System.out.println();

        for(int i=0; i < 6; i++) {
            System.out.printf("ball[%d]=%d\n",i+1 , ball[i]);
        }


    }
}
