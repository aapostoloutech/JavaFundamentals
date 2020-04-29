package gr.codehub.app;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Basket basket = new Basket();
        ui.manageBasket(basket);

        //basket.add(new Product("A1", "Ice Cream", 1.3f, 12));
        //basket.add(new Product("A2", "Potato", 1.1f, 7));
    }
}
