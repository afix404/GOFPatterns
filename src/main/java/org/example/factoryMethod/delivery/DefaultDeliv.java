package org.example.factoryMethod.delivery;

public class DefaultDeliv implements Delivery{
    @Override
    public void track() {
        System.out.println("отслеживание дефолт доставки");
    }

    @Override
    public void time2Deliv() {
        System.out.println("приедет через 3-5 дней");
    }
}
