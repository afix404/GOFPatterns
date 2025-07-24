package org.example.state;

public class DeliveredStatus implements ZakazStatus {

    @Override
    public void created() {
        System.out.println("Ошибка!");
    }

    @Override
    public void paid() {
        System.out.println("Ошибка!");
    }

    @Override
    public void delivered() {
        System.out.println("Ошибка!");
    }

    @Override
    public void cancelled() {
        System.out.println("Нельзя отменить доставленный заказ!");
    }
}
