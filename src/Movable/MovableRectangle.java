package Movable;

public class MovableRectangle implements Movable {
    private int length;
    private int width;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    public String toString() {
        return " ";
    }
    public boolean checkSpeed() {
        if ((topLeft.xSpeed==bottomRight.xSpeed)&(topLeft.ySpeed==bottomRight.ySpeed))
            return true;
        else
            return false;
    }
    public void moveUp(){
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }
    public void moveDown(){
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }
    public void moveLeft(){
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }
    public void moveRight(){
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }
}
