package Model.Application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramExer1 {
    public static void main(String[] args) {

        //Criando duas coleções com TreeSet
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Union - Unir as duas listas
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection - Somente os elementos que se repetem nas listas
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difference - Somente os elementos que são diferentes
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
        
    }
}
