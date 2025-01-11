package a1118;

public class Array2 {
    public static void main(String[] args) {
        int[] scores; // 배열 변수 선언
        scores = new int[] {83, 90, 87}; // 변수에 배열을 대입
        int result = 0;

        for(int i = 0; i < scores.length; i++) {
            result = result + scores[i];
        }

        System.out.println();
        System.out.println("총합 = " + result);

        //배열을 매개값으로 주고, printItem메소드 호출
        printItem(new int[] {83, 90, 87});
        
        
        
        
        
        
        
        
        
        
            } // 이건 뭔소린지 몰루게땅. 메소드를 만드는것 같은데...
            //printItem 메소드 선언
            public static void printItem(int[] scores) {
                // 매개변수가 참조하는 배열의 항목을 출력
                for(int i=0; i<3; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            }
}
