package org.example.factoryMethod.createDeliveries;

import org.example.factoryMethod.delivery.DefaultDeliv;
import org.example.factoryMethod.delivery.Delivery;

public class DefaultDeliveryFactory extends DeliveryFactory{
    @Override
    Delivery createDeliveryService() {
        return new DefaultDeliv();
    }
}
