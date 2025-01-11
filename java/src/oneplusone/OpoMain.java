package oneplusone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpoMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boot boot = new Boot();
        List<Product> products = new ArrayList<>();
        ProductService ps = new ProductService();
        Admin admin = new Admin(products);

        boot.booting();
        boot.loading();

        // 더미데이터 ==================================================================================
        // 브랜드
        Brand cu = new Brand(1, "CU");
        Brand gs = new Brand(2, "GS25");
        Brand emart = new Brand(3, "emart24");
        Brand sevenEleven = new Brand(4, "7ELEVEN");
        List<Brand> brands = new ArrayList<>();
        brands.add(cu);
        brands.add(gs);
        brands.add(emart);
        brands.add(sevenEleven);

        // 상품
        products.add(new Product(1, cu, "동원)양반호박죽       ", "1+1", 4500));
        products.add(new Product(2, cu, "칸타타)아메캔200ml     ", "2+1", 1500));
        products.add(new Product(3, gs, "허쉬)쿠키앤크림초콜릿40g", "1+1", 1800));
        products.add(new Product(4, gs, "정화)왕다리오징어50g     ", "2+1", 5900));
        products.add(new Product(5, emart, "롯데)깨수깡160ml     ", "1+1", 5000));
        products.add(new Product(6, emart, "아임이)고소바삭쌀과자100g(S)", "2+1", 5000));
        products.add(new Product(7, sevenEleven, "다논)액티비아업플레인210ml", "1+1", 2200));
        // ============================================================================================

        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│              모든 편의점을 담다, 행사상품 가이드 원플원!               │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        System.out.println("  ──────────────────────────────────────────────────────────────────────");
        System.out.println("    광고  |  " + "CU와 함께 연말파티 CHEERS! 인기 와인 41종 20% 할인행사");
        System.out.println("  ──────────────────────────────────────────────────────────────────────");

        while (true) {
            System.out.println("  ┌───────────────────────────────────────────────────────────────────┐");
            System.out.println("  │                                                                   │");
            System.out.println("  │                       메뉴를 선택해 주세요.                       │");
            System.out.println("  │                                                                   │");
            System.out.println("  │    [1] 전체 행사상품 목록               [4] 상품 검색             │");
            System.out.println("  │    [2] 1+1 행사상품 목록                [5] 관리자 메뉴           │");
            System.out.println("  │    [3] 2+1 행사상품 목록                [0] 프로그램 종료         │");
            System.out.println("  │                                                                   │");
            System.out.println("  └───────────────────────────────────────────────────────────────────┘");
            System.out.print("   입력 : ");

            int selectMenu = 0;
            try {
                selectMenu = scan.nextInt();
            } catch (Exception e) {
                System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
                scan.nextLine();
                continue;
            }
            switch (selectMenu) {
                case 1:
                    ps.allProducts(products);
                    break;

                case 2:
                    ps.opoProducts(products);
                    break;

                case 3:
                    ps.tpoProducts(products);
                    break;

                case 4:
                    ps.searchProducts(products);
                    break;

                case 5:
                    admin.showAdminMenu(products, brands);
                    break;

                case 0:
                    System.out.println("\n   ** 프로그램을 종료합니다. **\n");
                    return;

                default:
                    System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
                    break;
            }
        }















    }
}
