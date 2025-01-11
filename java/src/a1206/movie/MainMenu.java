package a1206.movie;

import java.io.IOException;
import java.util.ArrayList;

class MainMenu extends AbstractMenu {

    private static final MainMenu instance = new MainMenu(null);
    public static MainMenu getInstance() {
        return instance;
    }  //메인메뉴에 대한 싱글톤패턴 -
    private static final String MAIN_MENU_TEXT =  
    "1. 영화 예매하기 \n" +
    "2. 예매 확인하기\n" +
    "3. 예매 취소하기\n" +
    "4. 관리자 메뉴로 이동\n" +
    "q: 종료\n\n" +
    "메뉴를 선택하세요: ";
    
    private MainMenu(Menu prevMenu){
        super(MAIN_MENU_TEXT, prevMenu); //부모의 생성자를 호출
    }
   
   
    @Override
    public Menu next() {
            switch (scanner.nextLine()) {
                case "1":
                    reserve(); // 영화예매를 진행
                        return this; //메인 메뉴 객체 반환 (다시메인메뉴가나옴)
                
                    default:
                        break;
                }
            return null;
        }
    
    
        private void reserve() {
            try{
                ArrayList<Movie> movies = Movie.findAll();
                for(int i=0; i < movies.size();i++){
                    System.out.printf("%s\n",movies.get(i).toString());
                }
                System.out.print("예매할 영화를 선택해주세요");
                String movieIdStr = scanner.nextLine();
                Movie m = Movie.findById(movieIdStr);  //예매할 영화 찾음
                ArrayList<Reservation> reservations = Reservation.findById(movieIdStr);

            }catch(IOException e){
                System.out.printf(">> 파일 입출력에 문제가 생겼어요: %s\n", e.getMessage());
                e.printStackTrace(); // 예외 스택 추적 출력
            }catch(Exception e){
                System.out.printf(">> 예매에 실패:%s \n",e.getMessage());
            }
        }
    
}
