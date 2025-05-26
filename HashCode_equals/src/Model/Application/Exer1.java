package Model.Application;

import Model.Entities.ProdutoExer1;

public class Exer1 {
    public static void main(String[] args) {

        ProdutoExer1 p1 = new ProdutoExer1("Iphone", 2000.00);
        ProdutoExer1 p2 = new ProdutoExer1("Iphone", 2000.00);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}
