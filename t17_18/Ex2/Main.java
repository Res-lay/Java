package t17_18.Ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}$";
        Pattern p = Pattern.compile(regex);
        String t = "aE:dC:cA:56:76:54";
        String t1 = "01:23:45:67:89:Az";
        Matcher m = p.matcher(t);
        Matcher m1 = p.matcher(t1);
        System.out.println(m.matches());
        System.out.println(m1.matches());

    }
}
