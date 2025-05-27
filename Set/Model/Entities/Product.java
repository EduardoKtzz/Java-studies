package Model.Entities;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

    //Atributos
    private String name;
    private Double price;

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    //Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }
}
