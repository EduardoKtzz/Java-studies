package Model.Application;

import Model.Entities.Product;

import java.util.HashMap;
import java.util.Map;

public class ApplicationExer1 {

    public static void main(String[] args) {

        //Criando estrutura map
        Map<Product, Double> stock = new HashMap<>();

        //Instanciando alguns produtos para teste no sistema
        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Notebook", 1900.00);
        Product p3 = new Product("Tablet", 2900.00);

        //Inserindo produto no MAP
        stock.put(p1, 634.0);
        stock.put(p2, 222.0);
        stock.put(p3, 942.0);

        //Realizando a pesquisa
        Product ps = new Product("Tv", 900.0);

        //Exibindo se a pesquisa achou alguma chave dentro do MAP
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
