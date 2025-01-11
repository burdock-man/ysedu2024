package a1119;

import java.util.Scanner;

public class Numberstring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("값을 입력하세요: ");
        String input = scan.nextLine();
        
        String[] kor = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] unit = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십", "백", "천"};

        StringBuilder result = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            int num = input.charAt(i) - '0';
            if (num != 0) {
                result.append(kor[num]);
                result.append(unit[length - i - 1]);
            }
        }

        System.out.println();
        System.out.println("결과: " + result.toString());


    }
}
