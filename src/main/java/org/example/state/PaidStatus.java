package org.example.state;

public class PaidStatus implements ZakazStatus {

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
        System.out.println("Заказ успешно доставлен!");
    }

    @Override
    public void cancelled() {
        System.out.println("Заказ отменен!");
    }
}
