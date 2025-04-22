package org.example.abstract_factory.client;

import org.example.abstract_factory.factoryes.CharacterFactory;
import org.example.abstract_factory.items.Interfaces.Armor;
import org.example.abstract_factory.items.Interfaces.Transport;
import org.example.abstract_factory.items.Interfaces.Weapon;

public class GameCharacter {
    private Weapon weapon;
    private Transport transport;
    private Armor armor;

    public GameCharacter(CharacterFactory characterFactory){
        weapon = characterFactory.createWeapon();
        transport = characterFactory.createTransport();
        armor = characterFactory.createArmor();
    }
    public void createdCharacter(){
        weapon.use();
        transport.use();
        armor.use();
    }
}
