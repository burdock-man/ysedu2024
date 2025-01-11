package oneplusone;

public class Boot {
    public void booting() {
        System.out.println();
        System.out.println("" +
            "                                ..::::::::..\n" +
            "                             .::::::::::::::::.\n" +
            "                           .:::: ::::  :::: ::::.\n" +
            "                          ::::   ::      ::   ::::\n" +
            "                         ::::::: ::::  :::: :::::::\n" +
            "                         ::::::: :::::::::: :::::::\n" +
            "                          ::::::: :::::::: :::::::\n" +
            "                           ':::      ::      :::'\n" +
            "                             '::::::::::::::::'\n" +
            "                                ''::::::::''\n\n" +

            "                     ::::   ::   ::::::::::     ::::   ::\n" +
            "                   ::    :: ::     ::  ::     ::    :: ::\n" +
            "                     ::::   ::   ::::::::::     ::::   ::\n" +
            "                   :::::::: ::  ::::::::::::  :::::::: ::\n" +
            "                      ::   :::   ::::::::::      ::   :::\n" +
            "                    ::             ...'''      ::        \n" +
            "                     :::::::::   ::::::::::     :::::::::\n"
        );
    }

    public void loading() {
        boolean driveLoading = false;
        while (!driveLoading) {
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.print("\r프로그램 실행중입니다   ");
                    Thread.sleep(1000);
                    System.out.print("\r프로그램 실행중입니다·  ");
                    Thread.sleep(1000);
                    System.out.print("\r프로그램 실행중입니다·· ");
                    Thread.sleep(1000);
                    System.out.print("\r프로그램 실행중입니다···");
                    Thread.sleep(1000);
                }
                driveLoading = true;
                System.out.print("\r                                      \n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
