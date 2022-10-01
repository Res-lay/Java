package t6;

import java.util.Comparator;

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
    public void quickSort(Student[] array, int L, int R){

        if(L >= R){
            return;
        }

        if(array.length == 0){
            return;
        }

        int B = L + (R - L) / 2;
        int l = L;
        int r = R;
        Student temp;

        while(l <= r){
            while(comp.compare(array[r], array[B]) == 1){
                r--;
            }
            while(comp.compare(array[l], array[B]) == -1){
                l++;
            }

            if(L <= r) {
                temp = array[r];
                array[r] = array[l];
                array[l] = temp;
                l++;
                r--;
            }
            if (L < r){
                quickSort(array,L,r);
            }

            if(R > l){
                quickSort(array,l,R);
            }
        }
    }
}
