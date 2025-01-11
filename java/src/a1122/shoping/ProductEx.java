package a1122.shoping;

import java.util.Scanner;

public class ProductEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Product laptop = new Product("노트북", 1200, -1);
        Product desktop = new Product("데스크탑", 2000, 5);

        Product[] prodArr = {laptop, desktop};

        System.out.println("\n\n==================================[Product List]==================================\n\n");

        for(int i = 0; i < prodArr.length; i++) {
            System.out.println(prodArr[i].prodStr());
        }


        laptop.setPrice(-500);
        desktop.addStock(20);

        for(int i = 0; i < prodArr.length; i++) {
            System.out.println(prodArr[i].prodStr());
        }

        desktop.sellProduct(30);
        desktop.sellProduct(-20);
        desktop.sellProduct(20);

        for(int i = 0; i < prodArr.length; i++) {
            System.out.println(prodArr[i].prodStr());
        }

        System.out.println("\n\n==================================================================================\n\n");

    }
}
