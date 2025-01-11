package oneplusone;

import java.util.List;
import java.util.Scanner;

public class Admin {
    private Scanner scan = new Scanner(System.in);
    private ProductService productService = new ProductService();
    private List<Product> products;

    public Admin(List<Product> products) {
        this.products = products;
    }

    // 비밀번호 확인 메소드
    private boolean checkPassword() {
        final String correctPassword = "1234";  // 비밀번호
        System.out.print("   비밀번호를 입력하세요 (비밀번호 : 1234) : ");
        String inputPassword = scan.nextLine();
        
        // 비밀번호가 맞으면 true 반환, 틀리면 false 반환
        return inputPassword.equals(correctPassword);
    }

    public void showAdminMenu(List<Product> products, List<Brand> brands) {
        // 비밀번호 확인
        if (!checkPassword()) {
            System.out.println("\n   ** 오류 : 비밀번호가 틀렸습니다. 관리자 메뉴에 접근할 수 없습니다. **\n");
            return;  // 비밀번호가 틀리면 메뉴로 돌아감
        }

        while (true) {
            System.out.println("\n\n  ┌───────────────────────────────────────────────────────────────────┐");
            System.out.println("  │ ************************** 관리자 메뉴 ************************** │");
            System.out.println("  │                       메뉴를 선택해 주세요.                       │");
            System.out.println("  │                                                                   │");
            System.out.println("  │         [1] 상품 추가                   [4] 브랜드 추가           │");
            System.out.println("  │         [2] 상품 삭제                   [5] 브랜드 삭제           │");
            System.out.println("  │         [3] 상품 수정                   [0] 이전 메뉴             │");
            System.out.println("  │                                                                   │");
            System.out.println("  └───────────────────────────────────────────────────────────────────┘");
            System.out.print("   입력 : ");

            int selectMenu = scan.nextInt();
            switch (selectMenu) {
                case 1:
                    addProduct(products, brands);
                    break;
                case 2:
                    deleteProduct(products);
                    break;
                case 3:
                    updateProduct(products, brands);
                    break;
                case 4:
                    addBrand(brands);
                    break;
                case 5:
                    deleteBrand(brands);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
                    break;
            }
        }
    }

    private void addProduct(List<Product> products, List<Brand> brands) {
        System.out.println("\n\n  ┌──────────────────┐");
        System.out.println("  │ [1] 상품 추가    │");
        System.out.println("  ├────┬─────────────┤");
        System.out.println("  │ ID │    BRAND    │");
        System.out.println("  ├────┼─────────────┤");
        for (int i = 0; i < brands.size(); i++) {
            System.out.printf("  │ %2d │ %-7s     │\n", i + 1, brands.get(i).getBrandName());
        }
        System.out.println("  └────┴─────────────┘");
        System.out.print("   추가할 상품의 브랜드를 선택하세요 : ");
        int brandIndex = scan.nextInt() - 1;

        // 상품명 입력
        scan.nextLine();  // 버퍼 비우기
        System.out.print("   추가할 상품의 상품명을 입력하세요 : ");
        String productName = scan.nextLine();

        // 행사 내용 입력
        System.out.print("   추가할 상품의 행사를 입력하세요 : ");
        String event = scan.nextLine();

        // 가격 입력
        System.out.print("   추가할 상품의 상품 가격을 입력하세요 : ");
        int price = scan.nextInt();

        // 상품 추가
        Product newProduct = new Product(products.size() + 1, brands.get(brandIndex), productName, event, price);
        products.add(newProduct);
        System.out.println("\n   ** 상품이 추가되었습니다. **");
    }

    private void deleteProduct(List<Product> products) {
        System.out.println("\n\n  ┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("  │  [2] 상품 삭제                                                         │");
        System.out.println("  ├────┬─────────┬───────────────────────────────┬────────────┬────────────┤");
        System.out.println("  │ ID │  BRAND  │            PRODUCT            │   EVENT    │    PRICE   │");
        System.out.println("  ├────┼─────────┼───────────────────────────────┼────────────┼────────────┤");
        for (Product product : products) {
            System.out.printf("  │ %2d │ %-7s │ %-15s\t │ %-10s │ %,8d원 │\n", 
                product.getProdId(), product.getBrand().getBrandName(), product.getName(), product.getEvent(), product.getPrice());
        }
        System.out.println("  └────┴─────────┴───────────────────────────────┴────────────┴────────────┘\n");
    
        // 삭제할 상품의 ID 입력
        System.out.print("   삭제할 상품의 ID를 입력하세요 : ");
        int productId = scan.nextInt();
    
        // 상품 삭제
        boolean removed = products.removeIf(product -> product.getProdId() == productId);
        if (removed) {
            System.out.println("\n   ** 상품이 삭제되었습니다. **");
        } else {
            System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
        }
    }

    private void updateProduct(List<Product> products, List<Brand> brands) {
        System.out.println("\n\n  ┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("  │  [3] 상품 수정                                                         │");
        System.out.println("  ├────┬─────────┬───────────────────────────────┬────────────┬────────────┤");
        System.out.println("  │ ID │  BRAND  │            PRODUCT            │   EVENT    │    PRICE   │");
        System.out.println("  ├────┼─────────┼───────────────────────────────┼────────────┼────────────┤");
    
        // 상품 목록 출력
        for (Product product : products) {
            System.out.printf("  │ %2d │ %-7s │ %-15s\t │ %-10s │ %,8d원 │\n", 
                product.getProdId(), product.getBrand().getBrandName(), product.getName(), product.getEvent(), product.getPrice());
        }
        System.out.println("  └────┴─────────┴───────────────────────────────┴────────────┴────────────┘\n");
    
        // 수정할 상품의 ID 입력
        System.out.print("   수정할 상품의 ID를 입력하세요 : ");
        int productId = scan.nextInt();
    
        // 해당 상품 찾기
        Product productToUpdate = null;
        for (Product product : products) {
            if (product.getProdId() == productId) {
                productToUpdate = product;
                break;
            }
        }
    
        // 상품 수정
        if (productToUpdate != null) {
            System.out.println("\n  ┌────┬─────────────┐");
            System.out.println("  │ ID │    BRAND    │");
            System.out.println("  ├────┼─────────────┤");
            for (int i = 0; i < brands.size(); i++) {
                System.out.printf("  │ %2d │ %-7s     │\n", i + 1, brands.get(i).getBrandName());
            }
            System.out.println("  └────┴─────────────┘");
            System.out.print("   수정할 상품의 브랜드를 선택하세요 : ");
            int brandIndex = scan.nextInt() - 1;
    
            // 선택된 브랜드 설정
            if (brandIndex >= 0 && brandIndex < brands.size()) {
                Brand newBrand = brands.get(brandIndex);
                productToUpdate.setBrand(newBrand);
            } else {
                System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
            }
    
            // 2. 상품명 수정
            System.out.print("   수정할 상품의 상품명을 입력하세요 : ");
            String newName = scan.next();
            productToUpdate.setName(newName);
    
            // 3. 행사명 수정
            System.out.print("   수정할 상품의 행사를 입력하세요 : ");
            String newEvent = scan.next();
            productToUpdate.setEvent(newEvent);
    
            // 4. 가격 수정
            System.out.print("   수정할 상품의 가격을 입력하세요 : ");
            int newPrice = scan.nextInt();
            productToUpdate.setPrice(newPrice);
    
            System.out.println("\n   ** 상품이 수정되었습니다. **");
        } else {
            System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
        }
    }

    private void addBrand(List<Brand> brands) {
        System.out.println("\n\n  ┌──────────────────┐");
        System.out.println("  │ [4] 브랜드 추가  │");
        System.out.println("  ├────┬─────────────┤");
        System.out.println("  │ ID │    BRAND    │");
        System.out.println("  ├────┼─────────────┤");
        for (int i = 0; i < brands.size(); i++) {
            System.out.printf("  │ %2d │ %-7s     │\n", i + 1, brands.get(i).getBrandName());
        }
        System.out.println("  └────┴─────────────┘");
        System.out.print("   새로운 브랜드명을 입력하세요 : ");
        scan.nextLine();  // 버퍼 비우기
        String newBrandName = scan.nextLine();

        // 브랜드 추가
        Brand newBrand = new Brand(brands.size() + 1, newBrandName);
        brands.add(newBrand);
        System.out.println("\n   ** 브랜드가 추가되었습니다. **");
    }

    private void deleteBrand(List<Brand> brands) {
        System.out.println("\n\n  ┌──────────────────┐");
        System.out.println("  │ [5] 브랜드 삭제  │");
        System.out.println("  ├────┬─────────────┤");
        System.out.println("  │ ID │    BRAND    │");
        System.out.println("  ├────┼─────────────┤");
        for (int i = 0; i < brands.size(); i++) {
            System.out.printf("  │ %2d │ %-7s     │\n", i + 1, brands.get(i).getBrandName());
        }
        System.out.println("  └────┴─────────────┘");
        System.out.print("   삭제할 브랜드명을 입력하세요 : ");
        int brandIndex = scan.nextInt() - 1;

        // 브랜드 삭제
        brands.remove(brandIndex);
        System.out.println("\n   ** 브랜드가 삭제되었습니다. **");
    }
}