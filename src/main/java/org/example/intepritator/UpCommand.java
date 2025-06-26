package org.example.intepritator;

public class UpCommand implements Command{
    @Override
    public void execute(Robot robot) {
        System.out.println("робот двинулся вверх");
        robot.moveUp();
    }
}
