package org.example.observer;

public interface Subject {



    void publish(String string, boolean critical);

    void subscribe(Employee employee);

    void unsubscribe(Employee employee);




}
