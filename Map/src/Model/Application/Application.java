package Model.Application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        //MAP - É uma coleção de pares chave / valor

        //Não tem repetições de chave
        //Não possuem posições
        //Acesso, inserção e remoção de elementos são rapidas

        //USO COMUM - Cookies, local storage, etc...

        //HashMap, TreeMap, LimoedHashMap

        //Criando MAP com LInked para manter a ordem
        Map<String, String> cookies = new LinkedHashMap<>();

        //Inserindo valores dentro do MAP
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99323232");

        //Removendo uma chave dentro do map
        cookies.remove("phone");

        //Inserindo o mesmo valor, para testar se conseguimos inserir dois valores. MAP NÃO TEM REPETIÇÂO
        cookies.put("phone", "2323232311");

        //Fazendo testes com comandos em Map
        System.out.println("Existe uma chave de telefone?: " + cookies.containsKey("phone"));
        System.out.println("Email:: " + cookies.get("email"));
        System.out.println("Testando com uma chave que não existe: " + cookies.get("genero"));
        System.out.println("Tamanho do map: " + cookies.size());

        //Exibindo a lista toda de produtos dentro do map
        System.out.println();
        System.out.println("COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
