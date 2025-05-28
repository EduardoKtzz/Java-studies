package Model.Entities;

import java.util.Objects;

public class Product {

    //Atributos
    private String name;
    private Double price;

    //Construtor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
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


}
