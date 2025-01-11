package a1118;

public class Array4 {
    public static void main(String[] args) {
        // 배열 변수 선여과 배열 생성
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};
        // String season[] = {"Spring", "Summer", "Autumn", "Winter"}; // d이것도 됨
        System.out.println();
        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);
        System.out.println("season[2]: " + season[2]);
        System.out.println("season[3]: " + season[3]);

        // 인덱스1 항목의 값을 변경
        season[1] = "여름";
        System.out.println();
        System.out.println("season[1]: " + season[1]);

        // 배열 변수 선언과 배열 생성
        int[] scores = {83, 90, 87};
        int result = 0;

        //총합과 평균 구하기
        for(int i = 0; i < scores.length; i++) {
            result = result + scores[i];
        }

        double avg = (double) result / scores.length;

        System.out.println();
        System.out.println("총합 = " + result);
        System.out.printf("평균 = %.1f", avg);
        
    }
}
