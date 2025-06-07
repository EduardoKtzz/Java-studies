package Application;

import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {

        //Funciona como uma fila, do primeiro ao último conforme é removido
        Queue<String> queue = new LinkedList<>();

        //Simulando inserção de dados
        queue.add("Eduardo");
        queue.add("Dudu");
        queue.add("DWa");
        queue.add("Pedro");

        //Print
        System.out.println("Completo: " + queue);
        System.out.println("Pega o primeiro da lista: " + queue.peek()); //Vê quem é o primeiro da fila
        System.out.println("Processa o primeiro da lista: " + queue.poll()); //Processando
        System.out.println("Resultado:" + queue);

    }
}
