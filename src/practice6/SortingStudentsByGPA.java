package practice6;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getRate() == student2.getRate()){
            return 0;
        }
        else if (student1.getRate() > student2.getRate()){
            return 1;
        }
        else return -1;
    }
}