package gr.codehub.app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {

    public int menu(){
        System.out.println("1. Add product to Basket. \n 2. Remove a product. \n 3. Display basket. \n 4. Clear Basket. \n 5. Calculate Total Price. \n 6. Exit.");

        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        return choice;
    }

    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the product code");
        String code = scanner.next();
        System.out.println("Give the product name");
        String name = scanner.next();
        System.out.println("Give the product price");
        float price = scanner.nextFloat();
        System.out.println("Give the product quantity");
        int quantity = scanner.nextInt();

        return new Product(code, name, price, quantity);
    }
}
