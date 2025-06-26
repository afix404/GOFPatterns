package org.example.commands;

public class DeleteTextCommand implements Command{
    private TextEditor textEditor;

    public DeleteTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute(String text) {
        textEditor.deleteText(text);
        System.out.println("Текстовая команда удалена");
    }


    @Override
    public void undo() {
        textEditor.undoLastCommand();
        System.out.println("Удаление текстовой команды отменено");
    }


}
