package t1215.Ex4;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "+71234567890";
        arr[1] = "+76984521365";
        arr[2] = "86745893254";

        TNumber phone;
        for (int i = 0; i < 3; i++){
            phone = new TNumber(arr[i]);
            System.out.println(phone.phoneNumber);
        }
    }


}
