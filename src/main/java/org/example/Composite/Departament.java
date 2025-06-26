package org.example.Composite;

import java.util.ArrayList;

public class Departament implements EmployeeComponent{

    private ArrayList<EmployeeComponent> employeeArrayList = new ArrayList<>();
    private String name;
    public Departament(String name) {
        this.name = name;
        this.employeeArrayList = new ArrayList<>();
    }

    void add(EmployeeComponent employeeComponent ){
        employeeArrayList.add(employeeComponent);
    }
    void remove(EmployeeComponent employeeComponent ){
        employeeArrayList.remove(employeeComponent);
    }
    @Override
    public void display() {
        System.out.println(name);
        for (int i = 0; i < employeeArrayList.size(); i++) {
            employeeArrayList.get(i).display();
        }
    }

    @Override
    public Integer getSalary() {
        Integer summ = 0;
        System.out.println(name);
        for (int i = 0; i < employeeArrayList.size(); i++) {
            summ += employeeArrayList.get(i).getSalary();
        }


        return summ;
    }
}
