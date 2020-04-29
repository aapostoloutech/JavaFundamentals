package gr.codehub.app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Basket basket = new Basket();

        int choice;
        do {
            choice = ui.menu();

            switch (choice) {
                case 1:
                    basket.add(ui.createProduct());
                    break;
                case 2:

                    break;
                case 3:
                    basket.display();
                    break;
                case 4:
                    basket.clear();
                    break;
                case 5:
                    basket.getTotalCost();
                    break;
                case 0:

                    break;
                default:

            }
        } while(choice != 0);

        //Product product = new Product("A1", "Ice Cream", 1.3f, 12);
        //Product anotherProduct = new Product("A1", "Ice Cream", 1.3f, 12);

        //Customer customer = new Customer("C1","Alexandros", "Apostolou");

        //Basket basket = new Basket();

        //basket.add(product);
        //basket.add(anotherProduct);

        //basket.display();
        //System.out.println(basket.getTotalCost());

        //basket.clear();
    }

    public static float calculation(int quantity, float price){
        float tax = 1.1f;
        float totalPrice = quantity * price;

        return totalPrice + tax;
    }
}
