package practice6;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int rate;
    private SortingStudentsByGPA sortingByGPA = new SortingStudentsByGPA();
    public Student(String name, int id, int rate) {
        this.name = name;
        this.id = id;
        this.rate = rate;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getRate() {
        return rate;
    }
    public SortingStudentsByGPA getSortingByGPA() {
        return sortingByGPA;
    }
    @Override
    public int compareTo(Student student) {
        if (id == student.id){
            return 0;
        }
        else if (id > student.id){
            return 1;
        }
        else return -1;
    }
    @Override
    public String toString() {
        return "( Name: " + name + " ID: " + id + " Rating: " + rate + " )";
    }
}