package Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    //Criando duas listas com tipos diferentes
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex");
        printList(myStrs);
    }

    //Metodo para imprimir qualquer lista
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

