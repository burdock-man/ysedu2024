package a1118;

public class Array3 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        int[] arr1 = new int[3]; // 이건 3이 들어간게 아니라, 방이 3개가 있다는 뜻인가봄
        System.out.println(); // 근데 숫자 넣을땐 인덱스번호로 안치나? gpt한테 물어보니까 아니라곤 함.

        // 배열 항목의 초기값 출력
        for(int i=0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        System.out.println();

        for(int i=0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }


        //배열 변수 선언과 배열 생성
		String[] arr3 = new String[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		//배열 항목의 변경값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
    }
}
