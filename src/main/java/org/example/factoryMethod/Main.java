package org.example.factoryMethod;

import org.example.factoryMethod.createDeliveries.DefaultDeliveryFactory;
import org.example.factoryMethod.createDeliveries.DeliveryFactory;
import org.example.factoryMethod.createDeliveries.ExpressDeliveryFactory;

public class Main {
    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = new DefaultDeliveryFactory();
        deliveryFactory.processDel();
    }
}
