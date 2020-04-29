package gr.codehub.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void saveBasket(String filename){
        try {
            PrintWriter printWritter = new PrintWriter(new File(filename));
            for (Product p: products) {
                printWritter.println(p.getCode()+","+p.getName()+","+p.getPrice()+","+p.getQuantity());
            }
            printWritter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadBasket(String filename){
        clear();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()){
                String[] words = scanner.nextLine().split(",");
                Product product = new Product(
                        words[0],
                        words[1],
                        Float.parseFloat(words[2]),
                        Integer.parseInt(words[3])
                );

                add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
