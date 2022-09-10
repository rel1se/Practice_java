package practice3_ex1;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = "blue";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor() {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

