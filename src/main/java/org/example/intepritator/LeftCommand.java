package org.example.intepritator;

public class LeftCommand implements Command{
    @Override
    public void execute(Robot robot) {
        System.out.println("робот двинулся влево");
        robot.moveLeft();
    }
}
