package practice12_15.ex1;
import java.util.Scanner;
public class Application {
    public static void main(String[] args){
        System.out.print("Surname: ");
        Scanner sc = new Scanner(System.in);
        String surname = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Patronymic: ");
        String patronymic = sc.nextLine();
        Person a = new Person(surname.trim(), name.trim(), patronymic.trim());
        System.out.println(a.getFullName());
    }
}