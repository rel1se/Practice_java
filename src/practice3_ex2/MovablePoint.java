package practice3_ex2;
import java.lang.*;
public class MovablePoint implements Movable{
    protected int x,y,xSpeed,ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "Point: \n" + "x = " + x + "\ny = " + y + "\n Speed(Ox): " + xSpeed + "\n Speed(Oy): " + ySpeed;
    }
}
