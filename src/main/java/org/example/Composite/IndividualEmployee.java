package org.example.Composite;

public class IndividualEmployee implements EmployeeComponent{

    private String name;

    private String dolznost;

    private Integer salary;

    public IndividualEmployee(String name, String dolznost, Integer salary) {
        this.name = name;
        this.dolznost = dolznost;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Имя - " + name + " Должность - " + dolznost + " Зарплата - " + salary);
    }

    @Override
    public Integer getSalary() {
        return salary;
    }
}
