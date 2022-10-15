package practice12_15.ex1;
import java.util.Scanner;
public class Application {
    public static void main(String[] args){
        System.out.print("Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] fio = name.trim().split("([^a-zA-Zа-яА-Я])");
        if (fio.length == 3){
            Person person = new Person(fio[0], fio[1],fio[2]);
        }
        else if (fio.length == 2){
            Person person = new Person(fio[0],fio[1]);
        }
        else if (fio.length == 1){
            Person person = new Person(fio[0]);
        }
        else{
            new Person();
        }
        //System.out.println(a.getFullName());
    }
}