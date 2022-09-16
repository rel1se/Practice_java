package practice3_ex2;
import java.lang.*;
public class TestMovable {
    public static void Start(){
        MovablePoint p1 = new MovablePoint(5, 1, 3, 7);
        System.out.println(p1);
        p1.moveDown();
        p1.moveRight();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(5, 1, 3, 7, 10);
        System.out.println(c1);
        c1.moveLeft();
        c1.moveDown();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(1, 1, 10, 8, 10, 15);
        System.out.println(r1);
        r1.moveUp();
        r1.moveRight();
        System.out.println(r1);
    }
}
