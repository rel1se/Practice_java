package practice2;

public class Author {
    private String name,email;
    private char gender;
    public Author(){}
    public Author(String name, String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public void setEmail(){
        this.email = email;
    }
    public String toString(){
        return "Name: " + this.name +'\n'+ "email: " + this.email +'\n'+ "gender: " + this.gender;
    }

}
