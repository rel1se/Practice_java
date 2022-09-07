package practice3_ex2;
import java.lang.*;
public class MovableRectangle implements Movable{
    protected MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    protected boolean checkX() {
        return (topLeft.xSpeed == bottomRight.xSpeed);
    }

    protected boolean checkY() {
        return (topLeft.ySpeed == bottomRight.ySpeed);
    }
    @Override
    public void moveUp() {
        if (checkY()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkY()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveRight() {
        if (checkX()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft() {
        if (checkX()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public String toString() {
        return "Rectangle:\nTop left point:\n" + topLeft.toString() + "\nBottom right point:\n" + bottomRight.toString();
    }
}
