package org.example.state;

public class Zakaz {

    private ZakazStatus currentStatus;

    public Zakaz() {
        currentStatus = new CreatedStatus();
        System.out.println("Заказ успешно создан!");
    }

    public ZakazStatus getCurrentStatus() {
        return currentStatus;
    }

    protected void paid() {
        currentStatus.paid();
        currentStatus = new PaidStatus();
    }

    protected void delivered() {
        currentStatus.delivered();
        currentStatus = new DeliveredStatus();
    }

    protected void cancelled() {
        currentStatus.cancelled();
        currentStatus = new CancelledStatus();
    }
}
