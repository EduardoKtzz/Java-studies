package model.Application;

import model.Services.PrintService;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Instanciando o scanner e a classe printService
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<String>();

        //Pegando o tamanho da lista
        System.out.print("Digite a quantidade de números: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        //For para guardar os valores
        for(int i = 0; i<quantidade; i++) {
            String value = sc.nextLine();
            ps.addValue(value);
        }

        ps.print();  //Exibir os valores da lista
        System.out.println("First: " + ps.first());  //Exibir o primeiro item da lista
    }
}
