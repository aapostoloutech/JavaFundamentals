package gr.codehub.app;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<Product>();
//    private Customer customer;
//
//    public Basket(Customer customer) {
//        this.customer = customer;
//    }

    public void add(Product product){ products.add(product); }

    public void remove(Product product){ if(products.contains(product)) products.remove(product); }
    public void remove(int index){ if (index >= 0 && index < products.size()) products.remove(index); }

    public void clear(){ products.clear(); }

    public void display(){ System.out.println(products); }

    public float getTotalCost(){
        return products.stream()
                .map(p -> p.getPrice() * p.getQuantity())
                .reduce(0.0f, (a,b) -> a + b);
    }
}
