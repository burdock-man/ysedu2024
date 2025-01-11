package a1118;

public class Marray1 {
    public static void main(String[] args) {

        // 각 반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2ㅊ원 배열 생성
        int[][] mathScores = new int[2][3];
        for(int i=0; i < mathScores.length; i++) { // 방의 수만큼 반복
            for(int k = 0; k < mathScores[i].length; k++) { // 해당 반의 학생수 만큼 만큼 반복
                System.out.println("Math Scores["+i+"] ["+k+"]: " + mathScores[i][k] );
            }
        }

        System.out.println();
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        System.out.println();

        for(int i=0; i < mathScores.length; i++) { // 방의 수만큼 반복
            for(int k = 0; k < mathScores[i].length; k++) { // 해당 반의 학생수 만큼 만큼 반복
                System.out.println("Math Scores["+i+"] ["+k+"]: " + mathScores[i][k] );
            }
        }

        // 전체 학생의 수학 합계 구하기

        int totalMathSum = 0;
        int totalStudent = 0;

        for(int i=0; i < mathScores.length; i++) {

            for(int k = 0; k < mathScores[i].length; k++) {
                totalMathSum += mathScores[i][k];
                totalStudent += k;
            }
        }

        double avg = (double) totalMathSum / totalStudent;


        System.out.println();
        System.out.println("전체 학생수 합계: " + totalStudent);
        System.out.println("전체 학생 수학 합계: " + totalMathSum);
        System.out.printf("전체 학생 수학 평균: %.1f", avg);




    }
}

