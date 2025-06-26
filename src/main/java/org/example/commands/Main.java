package org.example.commands;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        RemoteControll remoteControll = new RemoteControll();
        InsertTextCommand insertTextCommand = new InsertTextCommand(textEditor);
        DeleteTextCommand deleteTextCommand = new DeleteTextCommand(textEditor);

        remoteControll.setCommand(insertTextCommand);
        remoteControll.insertCommand("Text");

        remoteControll.setCommand(deleteTextCommand);
        remoteControll.insertCommand("deleteTextCommand");
    }
    





}
