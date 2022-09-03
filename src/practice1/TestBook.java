package practice1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Idiot",600);
        Book b2 = new Book("Prestupleni i nakazanie", 500);
        Book b3 = new Book(400);
        b3.SetName("Voina i mir");
        b1.output();
        b2.output();
        b3.output();

    }
}
