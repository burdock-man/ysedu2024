package a1126.sec03;

public class SmartPhone extends Phone { // extends + 부모 클래스 이름
    public boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color); // 부모클래스의 생성자 호출
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷을 연결합니다.");
    }


}
