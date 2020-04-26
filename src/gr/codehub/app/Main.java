package gr.codehub.app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("A1", "Ice Cream", 1.3f, 12);
        Product anotherProduct = new Product("A1", "Ice Cream", 1.3f, 12);

        Customer customer = new Customer("C1","Alexandros", "Apostolou");

        Basket basket = new Basket(customer);

        basket.add(product);
        basket.add(anotherProduct);

        basket.display();
    }

    public static float calculation(int quantity, float price){
        float tax = 1.1f;
        float totalPrice = quantity * price;

        return totalPrice + tax;
    }
}
