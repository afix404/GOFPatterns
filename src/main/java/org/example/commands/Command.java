package org.example.commands;

public interface Command {

    void execute(String text);


    void undo();


}
