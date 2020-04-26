package gr.codehub.app;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<Product>();
    private Customer customer;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public void add(Product product){ products.add(product); }

    public void remove(Product product){ products.remove(product); }
    public void remove(int index){ products.remove(index); }

    public void clear(){
        for (Product p : products){
            products.remove(p);
        }
    }

    public void display(){
        System.out.println(products);
    }

    public float getTotalCost(){
        float totalCost = 0;
        for (Product p : products){
            totalCost += p.getPrice() * p.getQuantity();
        }

        return totalCost;
    }
}
