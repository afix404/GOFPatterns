package org.example.commands;

public class InsertTextCommand implements Command{

    private TextEditor textEditor;

    public InsertTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute(String text) {
        textEditor.insertText(text);
        System.out.println("Текстовая команда вставлена");
    }

    @Override
    public void undo() {
        textEditor.undoLastCommand();
        System.out.println("Вставка текстовой команды отменена");
    }

}
