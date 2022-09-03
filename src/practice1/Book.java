package practice1;
import java.lang.*;
public class Book {
    private int size;
    private String name;
    public Book(String n,int s){
        size = s;
        name = n;
    }
    public Book(int s){
        size = s;
    }
    public Book(){
        size = 300;
        name = "Idiot";
    }
    public void SetSize(int size){
        this.size = size;
    }
    public void SetName(String name){
        this.name = name;
    }
    public int GetSize(int size){
        return size;
    }
    public String GetName(String name){
        return name;
    }
    public String toString(){
        return this.name + ", size" + this.size;
    }
    public void output(){
        System.out.println("Название книги: " + name + '\n' + "Размер книги:" + size);
    }
}
