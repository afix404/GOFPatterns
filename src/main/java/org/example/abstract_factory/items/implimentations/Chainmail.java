package org.example.abstract_factory.items.implimentations;

import org.example.abstract_factory.items.Interfaces.Armor;

public class Chainmail implements Armor {
    @Override
    public void use() {
        System.out.println("кольчуга существует");
    }
}
