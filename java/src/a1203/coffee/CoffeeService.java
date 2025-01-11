package a1203.coffee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    Scanner scan = new Scanner(System.in);
    private boolean reOrder = false; // 고객의 추가주문 여부
    private int orderNum = 1;
    public CoffeeService() {
        orderList = new LinkedHashMap<>();
    } // orderList : 고객주문 저장
    // LinkedHashMap<>() : 입력순서 또는 접근순서 보장, 속도 약간 느림, 용도 : 순서가 중요할 떄 ㅇㅇ

    // 커피 객체 준비
    Coffee coffee = Coffee.getInstance();

    // 손님
    Customer customer;

    // 지연클래스 준비
    Thread t = new Thread(); // 아직 안배움

    Map<String, Integer> orderList;

    public void start() {
        System.out.println("\n어서오세요 연세IT커피숍입니다.");
        customer = new Customer(orderNum);
        coffee.getMenu();

        // 주문 메서드
        order();
    }
        
    private void order() {
        System.out.println("\n취소를 원하시면 0번을 눌러주세요");
        end:while (true) {
            try {
                System.out.println("\n원하시는 음료의 번호를 선택해주세요");
                System.out.print(">>> ");
                String choice = scan.next();
                int choiceNum = Integer.parseInt(choice.substring(0, 1));
                // 한글자만 추출해서 숫자로 변경
                if(choiceNum == 0) {
                    System.out.println("주문을 취소합니다.");
                    System.exit(0); // 빠져나감
                }
                scan.nextLine();
                String coffeeName = coffee.coffeeList.get(choiceNum-1);
                System.out.println("선택하신 음료는 " + coffeeName + "입니다.");
                System.out.println("몇 잔 주문하시겠습니까?");
                System.out.print(">>> ");
                int orderCount = scan.nextInt();
                scan.nextLine();

                // 재주문 if문
                if(reOrder) {
                    for(String coff : orderList.keySet()) {

                        if (coff.equals(coffeeName)) {
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            // 주문 한 커피 이름이 이미 있으면 주문리스트의 수량을 불러서 현재 수량과 더한다.
                            orderList.replace(coffeeName, addCount);
                        } else {
                            orderList.put(coffeeName, orderCount);
                            break;
                        }
                    }
                } else {
                    orderList.put(coffeeName, orderCount);
                }

                // 추가주문 메서드
                addOrder();
                // customer.setCoffeeOrder(orderList);
            
            } catch (Exception e) {
                System.out.println("잘못된 선택 입니다.");
                continue;
            }
            
        }
    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n주문을 계속 하시겠습니까?");
        System.out.println("예(Y) / 아니요(N)");
        String yesOrNo = scan.next();
        if(yesOrNo.equals("ㅇㅇ") || yesOrNo.equals("예") || yesOrNo.equalsIgnoreCase("y")) {
            coffee.getMenu();
            reOrder = true;
            order();
        } else if (yesOrNo.equals("ㄴㄴ") || yesOrNo.equals("아니요") || yesOrNo.equalsIgnoreCase("n")) {
            return;
        }
    }
}
