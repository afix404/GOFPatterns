package org.example.intepritator;

public class DownCommand implements Command{
    @Override
    public void execute(Robot robot) {
        System.out.println("робот двинулся вверх");
        robot.moveDown();
    }
}
