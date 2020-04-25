package gr.codehub.app;

public class Main {
    public static void main(String[] args) {
        int quantity = 12;
        float price = 1.3f;

        System.out.println("Total price = " + calculation(quantity, price));


        Product product = new Product();
        product.setCode("A1");

        System.out.println("Product Code : " + product.getCode());
    }

    public static float calculation(int quantity, float price){
        float tax = 1.1f;
        float totalPrice = quantity * price;

        return totalPrice + tax;
    }
}
