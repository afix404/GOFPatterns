package org.example.state;

public class Main {
    public static void main(String[] args) {

        Zakaz myZakaz = new Zakaz();
        myZakaz.cancelled();
        myZakaz.paid();
        myZakaz.delivered();
    }
}
