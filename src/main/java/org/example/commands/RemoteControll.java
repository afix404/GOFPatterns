package org.example.commands;

public class RemoteControll {

    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }


    public void insertCommand(String text){
        command.execute(text);
    }
}
