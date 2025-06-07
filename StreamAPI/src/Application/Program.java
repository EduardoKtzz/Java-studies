package Application;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        // Criando a lista com nomes
        List<String> nomes = new ArrayList<>();

        // Adicionando nomes
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Eduarda");
        nomes.add("Daniel");
        nomes.add("Eduarda");
        nomes.add("Fernando");

        // Exibindo os nomes e utlizando um filtro para puxar todos os nomes de Eduarda
        List<String> eduarda = nomes.stream().filter(nome -> nome.startsWith("Eduarda")).toList();
        List<String> eduarda1 = nomes.stream().filter(nome -> nome.startsWith("Eduarda")).map(String::toUpperCase).toList(); //LAMBDA
        String eduarda3 = nomes.stream().filter(nome -> nome.startsWith("Eduarda")).map(String::toUpperCase).reduce("Eduarda", (a, b) -> a + ", " + b);

        System.out.println("Eduarda: " + eduarda);
        System.out.println("Eduarda MAIÚSCULO :" + eduarda1);
        System.out.println("Eduarda unificada: " + eduarda3);
        }
    }

