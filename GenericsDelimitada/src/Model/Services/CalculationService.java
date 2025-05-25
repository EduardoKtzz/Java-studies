package Model.Services;

import java.util.List;

public class CalculationService {

    //Aqui vamos criar uma lista e informar que vamos trabalhar com generics (T), e vamos dar extends no Camarable
   public static <TypeT extends Comparable<TypeT>> TypeT max(List<TypeT> list) {
       if (list.isEmpty()) {
           throw new IllegalStateException("List can't be empty");  //Se a lista estiver vazia, eu dou um erro
       }
       TypeT max = list.getFirst();  //Pegar o primeiro elemento da lista

       //Aqui vamos pegar o mais valor dentro dessa lista
       for(TypeT item : list) {
           if (item.compareTo(max) > 0) {
               max = item;
           }
       }
       return max;
   }
}
