package t17_18.Ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\d+\\.\\d{1,2} (USD)|(RUR)|(EU)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("sfasf 23.87 USD sadf");
        Matcher m1 = p.matcher("sfasf 22 USD sadf");
        Matcher m2 = p.matcher("sfasf 0.002 USD sadf");
        System.out.println(m.find());
        System.out.println(m1.find());
        System.out.println(m2.find());
    }
}
