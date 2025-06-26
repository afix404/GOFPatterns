package org.example.factoryMethod.delivery;

public class ExpressDeliv implements Delivery{
    @Override
    public void track() {
        System.out.println("отслеживание экспресс доставки");
    }

    @Override
    public void time2Deliv() {
        System.out.println("приедет через 3 дня");
    }
}
