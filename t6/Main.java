package t6;

import java.lang.reflect.Array;

public class Main extends  QuickSort{
    public static void main(String[] args) {
        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student("Alex", 100, 1);
        iDNumber[1] = new Student("Nike", 25, 2);
        iDNumber[2] = new Student("Olga", 34, 4);
        iDNumber[3] = new Student("Maria", 120, 5);
        iDNumber[4] = new Student("Amber", 0, 3);
        quickSort(iDNumber);
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
//    public class Test1 extends QuickSort{
//        public static void test1(){
//
//        }
//    }

}