package a1203.coffee;

import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Coffee {
    
    // 싱글톤 생성

    private static Coffee instance;

    private Coffee() {}

    public static Coffee getInstance() {
        if(instance == null) { // 아직 객체 생성 전이면
            instance = new Coffee(); // 객체를 생성 
        }
        return instance;
    }

    // 메뉴 리스트로 저장
    ArrayList<String> coffeeList; // 메뉴 리스트
    ArrayList<Integer> coffeePrice; // 메뉴 가격
    Map<String, Integer> menu; // 맵이 부모고 링크드해쉬맵은 자식격이지만, 업캐스팅(자동형변환)이 수시로 된다.

    public void getMenu() {
        menu = new LinkedHashMap<String, Integer>();
        coffeeList = new ArrayList<>();
        coffeePrice = new ArrayList<>();
        coffeeList.add("아메리카노");
        coffeeList.add("아이스 아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("카푸치노");
        coffeeList.add("카페모카");
        coffeeList.add("카라멜 마끼아또");
        coffeePrice.add(2000);
        coffeePrice.add(2500);
        coffeePrice.add(3000);
        coffeePrice.add(4500);
        coffeePrice.add(3500);
        coffeePrice.add(4000);
        // System.out.println(coffeeList);

        for(int i = 0; i < coffeeList.size(); i++) {
            menu.put(coffeeList.get(i), coffeePrice.get(i));
        }
        DecimalFormat f = new DecimalFormat("0,000원");
        StringBuffer st = new StringBuffer();
        st.append("\n\n")
        .append("+-------------------------------------------------+\n")
        .append("|                                                 |\n")
        .append("|                      메뉴판                     |\n")
        .append("|    menu                                 price   |");
        
        System.out.println(st.toString());

        int s = 1;
        for (Map.Entry<String, Integer> get : menu.entrySet()) {
            System.out.printf("|  %d. %-22s \t %s  |\n", 
                              s++, get.getKey(), f.format(get.getValue()));
        }
        System.out.println("|                                                 |");
        System.out.println("+-------------------------------------------------+");
    }

}
