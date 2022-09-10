package practice3_ex1;
import java.lang.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.width = 3.0;
        this.length = 4.0;
        this.color = "blue";
        this.filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.color = "blue";
        this.filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
