package org.example.intepritator;

public class Robot {
    private int x = 0;
    private int y = 0;

    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveRight(){
        x++;
    }
    public void moveLeft(){
        x--;
    }

    public int getY() {
        return y;
    }
}
