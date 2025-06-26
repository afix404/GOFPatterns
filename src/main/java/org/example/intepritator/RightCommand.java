package org.example.intepritator;

public class RightCommand implements Command{
    @Override
    public void execute(Robot robot) {
        System.out.println("робот двинулся вправо");
        robot.moveRight();
    }
}
