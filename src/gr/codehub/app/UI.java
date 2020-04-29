package gr.codehub.app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {

    public Choice menu(){
        System.out.println("\n" +
                "1. Add product to Basket.\n" +
                "2. Remove a product.\n" +
                "3. Display basket.\n" +
                "4. Clear Basket.\n" +
                "5. Calculate Total Price.\n" +
                "6. Save Basket.\n" +
                "7. Load Basket.\n" +
                "0. Exit."
        );

        Scanner scanner = new Scanner(System.in);

        int choice;
        try {
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    return Choice.ADD;
                case 2:
                    return Choice.REMOVE;
                case 3:
                    return Choice.DISPLAY;
                case 4:
                    return Choice.CLEAR;
                case 5:
                    return Choice.TOTALCOST;
                case 6:
                    return Choice.SAVE;
                case 7:
                    return Choice.LOAD;
                case 0:
                    return Choice.EXIT;
                default:
                    return Choice.ERROR;
            }
        }
        catch (Exception e) { return Choice.EXIT; }
    }

    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Give the product code");
            String code = scanner.next();
            System.out.println("Give the product name");
            String name = scanner.next();
            System.out.println("Give the product price");
            float price = scanner.nextFloat();
            System.out.println("Give the product quantity");
            int quantity = scanner.nextInt();

            return new Product(code, name, price, quantity);
        } catch (Exception e) {
            System.out.println("Lets try again");

            return createProduct();
        }
    }

    public void removeProduct(Basket basket){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give product index to remove");
        try {
            basket.remove(scanner.nextInt());
            System.out.println("Product removed.");
        } catch (Exception e) {
            System.out.println("Try again.");
        }
    }

    public void manageBasket(Basket b){
        Basket basket = b;

        //basket.add(new Product("A1", "Ice Cream", 1.3f, 12));
        //basket.add(new Product("A2", "Potato", 1.1f, 7));

        Choice choice;
        do {
            choice = menu();

            switch (choice) {
                case ADD:
                    basket.add(createProduct());
                    break;
                case REMOVE:
                    removeProduct(basket);

                    break;
                case DISPLAY:
                    basket.display();
                    break;
                case CLEAR:
                    basket.clear();
                    break;
                case TOTALCOST:
                    basket.getTotalCost();
                    break;
                case SAVE:
                    basket.saveBasket("backet.txt");
                    System.out.println("File Saved.");
                    break;
                case LOAD:
                    basket.loadBasket("backet.txt");
                    System.out.println("File Loaded.");
                    break;
                case EXIT:

                    break;
                case ERROR:
                    System.out.println("Try again !");
                    break;
            }
        } while(choice != Choice.EXIT);
    }
}
