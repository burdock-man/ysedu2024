package a1125.member;

public class Main {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong","12345");
                if(result){
                    System.out.println("로그인되있습니다.");
                    memberService.logout("hong");
                }else{
                    System.out.println("id 또는 passward가 올바르지 않아요");
                }
            }
        }
        
        class MemberService {
            private String id;
            private String password;

            public boolean login(String id, String pw) {
                if (id.equals("hong") && pw.equals("12345"));
                return true;
            } else {
                return false;
            }
}