package org.example.abstract_factory.factoryes;

import org.example.abstract_factory.items.Interfaces.Armor;
import org.example.abstract_factory.items.Interfaces.Transport;
import org.example.abstract_factory.items.Interfaces.Weapon;
import org.example.abstract_factory.items.implimentations.Chainmail;
import org.example.abstract_factory.items.implimentations.Horse;
import org.example.abstract_factory.items.implimentations.Sword;

public class FantasyFactory implements CharacterFactory{


    @Override
    public Armor createArmor() {
        return new Chainmail();
    }

    @Override
    public Transport createTransport() {
        return new Horse();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
