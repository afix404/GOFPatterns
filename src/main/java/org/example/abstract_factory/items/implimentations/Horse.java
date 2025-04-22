package org.example.abstract_factory.items.implimentations;

import org.example.abstract_factory.items.Interfaces.Transport;

public class Horse implements Transport {
    @Override
    public void use() {
        System.out.println("Лошадь едет");
    }
}
