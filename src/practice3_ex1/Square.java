package practice3_ex1;
import java.lang.*;
public class Square extends Rectangle{
    protected  double side;
    public Square() {
        super(2, 2);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double side) {
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Shape: Square:\n" + "Side: " + this.width + ", color: "+ this.color + ", filled: " + this.filled;
    }
}
