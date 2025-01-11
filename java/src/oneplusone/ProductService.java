package oneplusone;

import java.util.List;
import java.util.Scanner;

public class ProductService {

    public void allProducts(List<Product> products) { // 전체 행사상품 출력
        System.out.println("\n\n  ┌───────────────────────────────────────────────────────────────────┐");
        System.out.println("  │  [1] 전체 행사상품 목록                                           │");
        System.out.println("  ├────┬─────────┬───────────────────────────────┬───────┬────────────┤");
        System.out.println("  │ ID │  BRAND  │            PRODUCT            │ EVENT │    PRICE   │");
        System.out.println("  ├────┼─────────┼───────────────────────────────┼───────┼────────────┤");
        for (Product product : products) {
            System.out.printf("  │ %2d │ %-7s │ %-15s\t │  %s  │  %,6d원  │\n",
                product.getProdId(), product.getBrand().getBrandName(), product.getName(), product.getEvent(), product.getPrice());
        }
        System.out.println("  └────┴─────────┴───────────────────────────────┴───────┴────────────┘\n");
    }

    public void opoProducts(List<Product> products) { // 1+1 행사상품 출력
        System.out.println("\n\n  ┌───────────────────────────────────────────────────────────────────┐");
        System.out.println("  │  [2] 1+1 행사상품 목록                                            │");
        System.out.println("  ├────┬─────────┬───────────────────────────────┬───────┬────────────┤");
        System.out.println("  │ ID │  BRAND  │            PRODUCT            │ EVENT │    PRICE   │");
        System.out.println("  ├────┼─────────┼───────────────────────────────┼───────┼────────────┤");
        for (Product product : products) {
            if ("1+1".equals(product.getEvent())) {
                System.out.printf("  │ %2d │ %-7s │ %-15s\t │  %s  │  %,6d원  │\n",
                        product.getProdId(), product.getBrand().getBrandName(), product.getName(), product.getEvent(), product.getPrice());
            }
        }
        System.out.println("  └────┴─────────┴───────────────────────────────┴───────┴────────────┘\n");
    }

    public void tpoProducts(List<Product> products) { // 2+1 행사상품 출력
        System.out.println("\n\n  ┌───────────────────────────────────────────────────────────────────┐");
        System.out.println("  │  [3] 2+1 행사상품 목록                                            │");
        System.out.println("  ├────┬─────────┬───────────────────────────────┬───────┬────────────┤");
        System.out.println("  │ ID │  BRAND  │            PRODUCT            │ EVENT │    PRICE   │");
        System.out.println("  ├────┼─────────┼───────────────────────────────┼───────┼────────────┤");
        for (Product product : products) {
            if ("2+1".equals(product.getEvent())) {
                System.out.printf("  │ %2d │ %-7s │ %-15s\t │  %s  │  %,6d원  │\n",
                        product.getProdId(), product.getBrand().getBrandName(), product.getName(), product.getEvent(), product.getPrice());
            }
        }
        System.out.println("  └────┴─────────┴───────────────────────────────┴───────┴────────────┘\n");
    }

    public void searchProducts(List<Product> products) { // 상품 검색
        Scanner scan = new Scanner(System.in);
        System.out.print("   검색할 상품명 입력하세요 : ");
        String searchTerm = scan.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("\n\n  ┌───────────────────────────────────────────────────────────────────┐");
        System.out.println("  │  [4] 상품 검색                                                    │");
        System.out.println("  ├────┬─────────┬───────────────────────────────┬───────┬────────────┤");
        System.out.println("  │ ID │  BRAND  │            PRODUCT            │ EVENT │    PRICE   │");
        System.out.println("  ├────┼─────────┼───────────────────────────────┼───────┼────────────┤");
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchTerm) || 
                product.getBrand().getBrandName().toLowerCase().contains(searchTerm)) {
                System.out.printf("  │ %2d │ %-7s │ %-15s\t │  %s  │  %,6d원  │\n",
                        product.getProdId(), product.getBrand().getBrandName(), product.getName(), product.getEvent(), product.getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("  │                         검색된 상품이 없습니다.                   │");
        }
        System.out.println("  └────┴─────────┴───────────────────────────────┴───────┴────────────┘\n");
    }
}