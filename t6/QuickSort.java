package t6;

import java.util.Comparator;
import java.util.Arrays;

public abstract class QuickSort<T>{
    Comparator<Student> comp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getId() == o2.getId()){
                return 0;
            }
            else if (o1.getId() > o2.getId()){
                return 1;
            }
            else{
                return -1;
            }
        }
    };
    public static void quickSort(Student[] array){

        Arrays.sort(array, Comparator.reverseOrder());
    }
}
