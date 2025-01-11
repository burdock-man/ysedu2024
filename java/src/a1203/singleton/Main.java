package a1203.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("이건 로거1 메세지입니당");

        SingletonLogger logger2 = SingletonLogger.getInstance();
        logger2.log("이건 로거2 메세지입니당");

        if(logger == logger2) {
            System.out.println("두 로거 인스턴스는 같습니당. 띠용!?");
        }
    }
}
