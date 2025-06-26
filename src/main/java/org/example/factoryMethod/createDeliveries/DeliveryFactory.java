package org.example.factoryMethod.createDeliveries;

import org.example.factoryMethod.delivery.Delivery;

public abstract class DeliveryFactory {
    abstract Delivery createDeliveryService();

    public void processDel(){
        Delivery delivery = createDeliveryService();
        delivery.time2Deliv();
        delivery.track();
    }
}
