package practice1;
import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(14,"White", "Football");
        Ball b2 = new Ball(13,"Yellow-Blue", "Volleyball");
        Ball b3 = new Ball(15,"Orange");
        b3.SetSport("Basketball");
        b1.output();
        b2.output();
        b3.output();
    }
}
