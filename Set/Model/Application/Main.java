package Model.Application;

import Model.Entities.Product;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Product> productsHash = new HashSet<>();  //Criando uma coleção de HashSet
        TreeSet<Product> productsTree = new TreeSet<>();    //Criando uma coleção de TreeSet
        LinkedHashSet<Product> productLinked = new LinkedHashSet<>();   //Criando uma coleção de LinkedHashSet

        //Criando produtos para realizar testes
        Product p1 = new Product("TV", 3000.00);
        Product p2 = new Product("Notebook", 4500.00);
        Product p3 = new Product("Tablet", 1500.00);
        Product p4 = new Product("TV", 2500.00);

        //Adicionando valores dentro dos conjuntos
        productsHash.add(p1);
        productsHash.add(p2);
        productsHash.add(p3);
        productsHash.add(p4);

        productsTree.add(p1);
        productsTree.add(p2);
        productsTree.add(p3);
        productsTree.add(p4);

        productLinked.add(p1);
        productLinked.add(p2);
        productLinked.add(p3);
        productLinked.add(p4);

        //Verificando produtos unicos com base no nome
        System.out.println("Produtos únicos: " + productsHash.size());
        System.out.println("Produtos únicos: " + productsTree.size());
        System.out.println("Produtos únicos: " + productLinked.size());
        System.out.println();

        //Exibindo a lista de produtos que não são repetidos
        for (Product productH : productsHash) {
            System.out.println(productH);
        }

        System.out.println();

        for (Product productT : productsTree) {
            System.out.println(productT);
        }

        System.out.println();

        for (Product productL : productLinked) {
            System.out.println(productL);
        }






    }
}
