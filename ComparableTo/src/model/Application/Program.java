package model.Application;

import model.Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        System.out.println();

        //Criar uma lista e definir o caminho do arquivo
        List<Employee> list = new ArrayList<>();
        String path = "model/txt/exer1.txt";

        //Try catch para ler um arquivo até a ultima linha dele
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(","); //Aqui vamos separar o nome do preco por causa da virgula
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            //Aqui vamos ordenar a lista pel alfabeto
            Collections.sort(list);

            //Exibir a lista
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e ) {   //Pegar erro caso de algum
            System.out.println("Error: " + e.getMessage());
        }
    }
}
