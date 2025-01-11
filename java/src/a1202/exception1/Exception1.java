package a1202.exception1;

public class Exception1 {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3};

        try {

            System.out.println("이거임>>" + numbers[2]);
            System.out.println("이거임>>" + numbers[5]);

        } catch(ArrayIndexOutOfBoundsException e) {
    
            System.out.println("배열 인덱스 범위 초과" + e.getMessage());

        }





    }
}
