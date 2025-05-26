package Model.Entities;

import java.util.Objects;

public class ProdutoExer1 {

    //Atributos
    private String name;
    private double price;

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoExer1 that = (ProdutoExer1) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //Construtor
    public ProdutoExer1(String name, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
