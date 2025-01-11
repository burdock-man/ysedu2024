package a1126.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "깜장색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("칼라: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세용");
        myPhone.receiveVoice("누구세용?");
        myPhone.sendVoice("싸랑~해요~");
        myPhone.hangUp();

        // myPhone.wifi = true;
        myPhone.setWifi(true);
        myPhone.internet();


    }
}
