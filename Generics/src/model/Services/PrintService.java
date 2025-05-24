package model.Services;
import java.util.ArrayList;
import java.util.List;

//Aqui vamos colocar um elemento generics tipo E
public class PrintService<TypeE> {

    //Criando lista par armazenar os valores
    private final List<TypeE> list = new ArrayList<>();

    public void addValue(TypeE value) {
        list.add(value);
    }

    //Aqui vamos pegar o primeiro elemento da lista, e caso esteja vazia retorna um erro
    public TypeE first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.getFirst();  //Pegar o primeiro elemento da lista
    }

    public void print() {
        System.out.println(list);
    }
}
