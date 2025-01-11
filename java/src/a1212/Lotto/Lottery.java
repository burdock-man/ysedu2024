package a1212.Lotto;

public class Lottery {
    String randomNum = "";
    String[] randomNumbers = new String[6];


    // 랜덤 로또번호 생성
    // 범위 갖는 랜덤값
    public void randomLotteryNum() {
        for(int i = 0; i < 6; i++) {
            randomNum = randomNum + random(0, 9);
                    }
                    this.randomNum = randomNum;
                }
            
            
                private static int random(int min, int max) {
                    int num = (int)((Math.random()*(max-min+1)));
                    return num;
                }


                public void LotteryNum() {
                    System.out.println("\n[INFO] 로또 당첨 번호 안내 드립니다.");
		System.out.println("\n★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("★☆★☆★☆★☆★☆[" + randomNum + "]★☆★☆★☆★☆★☆");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
                }


                public void result(Membership m, Purchase p) {
                    if(p.customerNum.equals(randomNum)) {
                        System.out.println("님 번호 : " + p.customerNum);
                        System.out.println("당첨번호 : " + randomNum);
                        System.out.println("ㅊㅋㅊㅋ!!");
                    } else {
                        System.out.println("님 번호 : " + p.customerNum);
                        System.out.println("당첨번호 : " + randomNum);
                        System.out.println("ㅋㅋ ㅗ");
                    }
                }

                
}
