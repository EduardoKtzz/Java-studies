package Model.Application;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        //Aqui estamos a instanciar o hashset
        Set<String> set = new HashSet<>();

        //Adicionando itens dentro do set
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Lapis");
        set.add("Ventilador");
        set.add("Caderno");

        //Remove
        set.remove("Caderno");
        set.removeIf(x -> x.length() >= 10); //Remove itens que tem 10 ou mais letras
        set.removeIf(x -> x.charAt(0) == 'L'); //Remove itens que começam com T

        //Aqui vamos testar se existe essa ‘String’ na nossa coleção
        System.out.println(set.contains("Notebook"));

        //Exibir todo o conjunto
        for (String p : set) {
            System.out.println(p);
        }
    }
}
