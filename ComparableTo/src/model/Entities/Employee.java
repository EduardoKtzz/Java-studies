package model.Entities;

public class Employee implements Comparable<Employee> {

    //Attributes
    private String name;
    private Double salary;

    //Constructor
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return -salary.compareTo(other.getSalary());
    }
}
