package org.example.Composite;

public class Main {
    public static void main(String[] args) {
        IndividualEmployee  individualEmployee = new IndividualEmployee("Name1", "director", 100000);
        IndividualEmployee  individualEmployee2 = new IndividualEmployee("Name2", "Nedirector", 10000);
        IndividualEmployee  individualEmployee3 = new IndividualEmployee("Name3", "bebebe", 10000);
        Departament departament = new Departament("IT");
        departament.add(individualEmployee2);
        departament.add(individualEmployee);

        Departament departament2 = new Departament("BackEnd");
        departament2.add(individualEmployee3);
        departament.add(departament2);
        departament.display();
        System.out.println(departament.getSalary());
    }
}
