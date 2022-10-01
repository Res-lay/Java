package t6;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int finalScore;
    private SortingStudentsByGPA sortingByGPA = new SortingStudentsByGPA();

    public Student(String name, int finalScore, int id) {
        this.id = id;
        this.name = name;
        this.finalScore = finalScore;
    }

    public int getScore() {
        return this.finalScore;
    }

    public int getId() {
        return this.id;
    }

    public int getFinalScore() {
        return finalScore;
    }

    @Override
    public int compareTo(Student student) {
        if (id == student.id) {
            return 0;
        } else if (id > student.id) {
            return 1;
        } else {
            return -1;
        }
    }

    public SortingStudentsByGPA getSortingByGPA() {
        return sortingByGPA;
    }

    @Override
    public String toString() {
        return ("{ name: \"" + name + "\", id: " + id + ", final-score: " + finalScore + " }");
    }
}
