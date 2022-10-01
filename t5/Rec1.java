package t5;

public class Rec1 {
    public static String recursion(int num){
        if (num == 0) {
            return null;
        }

        System.out.println(String.valueOf(num % 10));
        num /= 10;
        return recursion(num);
    }
}
