package org.example.observer;

public class Employee implements Observer{


    private String name;

    private boolean isNachalnik;

    @Override
    public void update(String string) {
        System.out.println(string);
    }

    public String getName() {
        return name;
    }

    public boolean isNachalnik() {
        return isNachalnik;
    }
}
