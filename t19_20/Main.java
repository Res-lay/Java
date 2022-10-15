package t19_20;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        HashSet<String> arrNumber = new HashSet<>();
        ArrayList<String> listNumber = new ArrayList<String>();
        TreeSet setNumber = new TreeSet<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        for (int i = 111; i < 999; i+=111){
            if (count == N){break;}
            for(String letter1:letters){
                if (count == N){break;}
                for(String letter2:letters){
                    if (count == N){break;}
                    for(String letter3:letters){
                        if (count == N){break;}
                        for(int reg = 1; reg < 200; reg++){
                            arrNumber.add(String.format("%s%d%s%s%02d",letter1,i,letter2,letter3, reg));
                            listNumber.add(String.format("%s%d%s%s%02d",letter1,i,letter2,letter3, reg));
                            setNumber.add(String.format("%s%d%s%s%02d",letter1,i,letter2,letter3, reg));
                            count ++;
                            if (count == N){break;}
                        }
                    }
                }
            }
        }
        long m = System.nanoTime();
        System.out.println(arrNumber.contains("А111АА15"));
        System.out.println((double) (System.nanoTime() - m));
        Collections.sort(listNumber);
        m = System.currentTimeMillis();
        System.out.println(Collections.binarySearch(listNumber, "А111АА15"));
        System.out.println((double) (System.nanoTime() - m));
        m = System.currentTimeMillis();
        System.out.println(listNumber.contains("А111АА15"));
        System.out.println((double) (System.nanoTime() - m));
        m = System.currentTimeMillis();
        System.out.println(setNumber.contains("А111АА15"));
        System.out.println((double) (System.nanoTime() - m));
    }
}
