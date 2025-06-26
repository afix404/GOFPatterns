package org.example.abstract_factory.a;

public class PaymentSupportHandler implements SupportHandler {

    SupportHandler next;

    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void requestHandle(String request) {
        if(request.contains("payment")){
            System.out.println("Запрос по оплате опознан");
            next.requestHandle(request);
        }else{
            System.out.println("Запрос по оплате провален");
            next.requestHandle(request);
        }
    }
}
