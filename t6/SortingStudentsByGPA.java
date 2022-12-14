package t6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getScore() == s2.getScore()){
            return 0;
        }
        else if(s1.getScore() > s2.getScore()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
