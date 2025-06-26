package org.example.factoryMethod.createDeliveries;

import org.example.factoryMethod.delivery.Delivery;
import org.example.factoryMethod.delivery.ExpressDeliv;

public class ExpressDeliveryFactory extends DeliveryFactory{
    @Override
    Delivery createDeliveryService() {
        return new ExpressDeliv();
    }
}
