package practice12_15.ex1;

public class Person {
    String name;
    String surname;
    String patronymic;
    public Person(String surname,String name, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    private StringBuffer getInitial(String word){
        if (word != ""){
            return new StringBuffer().append(word.charAt(0)).append(".");
        }
        return new StringBuffer("");
    }
    public String getFullName(){
        StringBuffer temp;
        StringBuffer res = new StringBuffer(surname);
        temp = getInitial(name);
        if (temp.length() != 0){
            res.append(" ").append(temp);
        }
        temp = getInitial(patronymic);
        if (temp.length() != 0) {
            if (res.charAt(res.length() - 1) == '.') {
                res.append(temp);
            } else {
                res.append(" ").append(temp);
            }
        }
        return res.toString();
    }
}
