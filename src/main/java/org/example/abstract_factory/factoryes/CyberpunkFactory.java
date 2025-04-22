package org.example.abstract_factory.factoryes;

import org.example.abstract_factory.items.Interfaces.Armor;
import org.example.abstract_factory.items.Interfaces.Transport;
import org.example.abstract_factory.items.Interfaces.Weapon;
import org.example.abstract_factory.items.implimentations.Drone;
import org.example.abstract_factory.items.implimentations.Exoskeleton;
import org.example.abstract_factory.items.implimentations.LaserBlaster;

public class CyberpunkFactory implements CharacterFactory{
    @Override
    public Armor createArmor() {
        return new Exoskeleton();
    }

    @Override
    public Transport createTransport() {
        return new Drone();
    }

    @Override
    public Weapon createWeapon() {
        return new LaserBlaster();
    }
}
