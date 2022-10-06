package practice8;

public class User {
    String name;
    int age;
    User (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "{ Name: \"" + name + "\", Age: \"" + age + "\"}";
    }
}
