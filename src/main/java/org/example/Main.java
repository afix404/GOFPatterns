package org.example;

import org.example.abstract_factory.client.GameCharacter;
import org.example.abstract_factory.factoryes.CharacterFactory;
import org.example.abstract_factory.factoryes.CyberpunkFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CharacterFactory characterFactory = new CyberpunkFactory();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        GameCharacter gameCharacter = new GameCharacter(characterFactory);
        gameCharacter.createdCharacter();

    }
}