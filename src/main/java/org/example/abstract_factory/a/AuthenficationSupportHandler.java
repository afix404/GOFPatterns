package org.example.abstract_factory.a;

public class AuthenficationSupportHandler implements SupportHandler{

    SupportHandler next;


    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void requestHandle(String request) {
        if(request.contains("auth")){
            System.out.println("Запрос по аутенфикации опознан");
            next.requestHandle(request);
        }else{
            System.out.println("Запрос по аутенфикации провален");
            next.requestHandle(request);
        }
    }
}
