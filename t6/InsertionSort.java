package t6;

public abstract class InsertionSort {
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length - 1; i++){
            for(int j = i; j > 0 && arr[j - 1].getId() > arr[j].getId(); j--){
                swap(arr[j], arr[j-1]);
            }
        }
    }

    private static void swap(Student student, Student student1) {
        Student temp = student;
        student = student1;
        student1 = temp;
    }
}
