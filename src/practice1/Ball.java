package practice1;
import java.lang.*;
public class Ball {
    private int radius;
    private String color,sport;
    public Ball(int rad, String c,String s){
        radius = rad;
        color = c;
        sport = s;
    }
    public Ball(int rad, String c){
        radius = rad;
        color = c;
    }
    public Ball(){
        radius = 3;
        color = "White";
        sport = "Golph";
    }
    public void SetRad(int radius){
        this.radius = radius;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public void SetSport(String sport){
        this.sport = sport;
    }
    public int GetRad(int radius){
        return radius;
    }
    public String GetColor(String color){
        return color;
    }
    public String GetSport(String sport){
        return sport;
    }
    public String toString(){
        return this.sport + ", color" + this.color;
    }
    public void output(){
        System.out.println("Радиус мяча: " + radius + '\n' + "Цвет:" + color);
    }
}
