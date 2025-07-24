
package org.example.state;
public class CreatedStatus implements ZakazStatus {

    @Override
    public void created() {
        System.out.println("Заказ уже создан!");
    }

    @Override
    public void paid() {
        System.out.println("Заказ успешно оплачен!");
    }

    @Override
    public void delivered() {
        System.out.println("Ошибка!");
    }

    @Override
    public void cancelled() {
        System.out.println("Заказ отменен!");
    }
}
