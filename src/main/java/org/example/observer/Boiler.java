package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Boiler implements  Subject{

    Integer temperatura;

    Integer waterLvl;

    Integer urovenMasla;

    ArrayList<Employee> employees = new ArrayList<>();


    void addTemp(Integer integer){
        temperatura+=integer;
        if(integer>=10){
            publish("Уровень температуры повышен, сейчас:" + temperatura, false);
        }
    }

    void addWater(Integer integer){
        waterLvl+=integer;
        if(integer>=100){
            publish("Уровень воды повышен, сейчас:" + waterLvl, false);
        }

    }

    void deleteMaslo(Integer integer){
        urovenMasla-=integer;
        if(integer>=10){
            publish("Уровень масла понижен, сейчас:" + urovenMasla, true);
        }
    }


    @Override
    public void publish(String string, boolean critical) {
        for (int i = 0; i < employees.size(); i++) {
            if(critical==true && employees.get(i).isNachalnik()==true){
                employees.get(i).update(string);
            }
            if(employees.get(i).isNachalnik()==false){
                employees.get(i).update(string);
            }
        }
    }

    @Override
    public void subscribe(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void unsubscribe(Employee employee) {
        employees.remove(employee);
    }
}
