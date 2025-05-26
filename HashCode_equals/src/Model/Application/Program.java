package Model.Application;

import Model.Entities.Client;

public class Program {
    public static void main(String[] args) {

        //Simulando clientes para teste
        Client c1 = new Client("Eduardo", "edu@gmail.com");
        Client c2 = new Client("Eduardo", "edu@gmail.com");

        //Fazendo as comparações
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //isso aqui ele compara a posição de memória do objet

    }
}
