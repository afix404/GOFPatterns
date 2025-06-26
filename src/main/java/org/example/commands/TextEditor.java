package org.example.commands;

public class TextEditor {




    void insertText(String text){
        System.out.println("Вставка текста " + text);
    }

    void deleteText(String text){
        System.out.println("Удаление текста " + text);
    }
    void undoLastCommand(){
        System.out.println("Последняя команда отменена ");
    }



}
