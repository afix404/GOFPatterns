package org.example.abstract_factory.a;

public class GeneralSupportHandler implements SupportHandler{

    SupportHandler next;

    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void requestHandle(String request) {
        if(request.contains("general")){
            System.out.println("Запрос по general опознан");

        }else{
            System.out.println("Запрос по general провален");

        }
    }
}
