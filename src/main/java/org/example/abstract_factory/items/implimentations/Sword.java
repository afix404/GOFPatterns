package org.example.abstract_factory.items.implimentations;

import org.example.abstract_factory.items.Interfaces.Weapon;

public class Sword implements Weapon {

    @Override
    public void use() {
        System.out.println("использование меча");
    }
}
