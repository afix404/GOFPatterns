package org.example.memento;

import java.util.LinkedList;

public class SettingsManager {


    LinkedList<Settings> settingsLinkedList = new LinkedList<>();

    Settings lastSettings;

    Integer lastIndex;

    Settings currentSettings;

    void save(){
        settingsLinkedList.add(currentSettings);
        System.out.println("Настройки сохранены под номером " + lastIndex);
        lastIndex++;
        lastSettings = currentSettings;
    }
    void redo(){

    }

    /*void undo(){
        
        currentSettings = settingsLinkedList.
    }*/
}
