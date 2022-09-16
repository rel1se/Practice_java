package practice3_ex2;
import java.lang.*;
public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public String toString() {
        return "Circle:\nCenter:\n" + center.toString() + "\nRadius = " + radius;
    }
}
