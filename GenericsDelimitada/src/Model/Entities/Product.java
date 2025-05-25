package Model.Entities;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f", name, price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
