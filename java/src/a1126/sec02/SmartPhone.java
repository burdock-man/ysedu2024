package a1126.sec02;

public class SmartPhone extends Phone { // extends + 부모 클래스 이름
    public boolean wifi;

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷을 연결합니다.");
    }

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }


}
