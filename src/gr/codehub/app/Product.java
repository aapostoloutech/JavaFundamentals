package gr.codehub.app;

import java.util.Objects;

public class Product {
    private String code;
    private String name;
    private float price;
    private int quantity;

    public Product(String code, String name, float price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }
    public String getName() { return name; }
    public float getPrice() { return price; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return "Product: { Code='" + code + '\'' +
                ", Name='" + name + '\'' +
                ", Price=" + price +
                ", Quantity=" + quantity +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 &&
                quantity == product.quantity &&
                Objects.equals(code, product.code) &&
                Objects.equals(name, product.name);
    }
}
