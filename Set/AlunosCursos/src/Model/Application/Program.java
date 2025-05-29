package Model.Application;

import Model.Entities.Aluno;

import java.util.HashSet;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Aluno> alunos = new HashSet<>();

        System.out.print("How many students for course A? ");
        int cursoA = sc.nextInt();

        for(int i = 0; i < cursoA; i++) {
            int id = sc.nextInt();
            Aluno alunoA = new Aluno(id);
            alunos.add(alunoA);
        }

        System.out.print("How many students for course B? ");
        int cursoB = sc.nextInt();

        for(int i = 0; i < cursoB; i++) {
            int id = sc.nextInt();
            Aluno alunoB = new Aluno(id);
            alunos.add(alunoB);
        }

        System.out.print("How many students for course C? ");
        int cursoC = sc.nextInt();

        for(int i = 0; i < cursoC; i++) {
            int id = sc.nextInt();
            Aluno alunoC = new Aluno(id);
            alunos.add(alunoC);
        }

        System.out.println();
        System.out.println("Total students: " + alunos.size());
        for (Aluno todosAlunos : alunos) {
            System.out.println(todosAlunos);
        }
        
        sc.close();
    }
}
