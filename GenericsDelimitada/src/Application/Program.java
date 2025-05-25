package Application;

import Model.Entities.Product;
import Model.Services.CalculationService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Criando uma lista de produtos
        List<Product> list = new ArrayList<>();

        //Lendo caminho com txt dos produtos
        String path = "C:\\Users\\Eduar\\Documentos\\Programação\\Java\\GenericsDelimitada\\src\\txt\\Produtos";

        //Try para ler as linhas do arquivo caso elas não estejam vazias
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Product(Double.parseDouble(fields[1]), fields[0]));
                line= br.readLine();
            }

            //responsavel por imprimir o maior preço das linhas e caso de erro temos o catch
            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
