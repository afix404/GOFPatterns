package org.example.abstract_factory.factoryes;

import org.example.abstract_factory.items.Interfaces.Armor;
import org.example.abstract_factory.items.Interfaces.Transport;
import org.example.abstract_factory.items.Interfaces.Weapon;

public interface CharacterFactory {

    Armor createArmor();
    Transport createTransport();
    Weapon createWeapon();

}
