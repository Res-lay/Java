package t17_18.Ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern p = Pattern.compile(regex);
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Matcher m = p.matcher(input);
        if(m.matches())
        {
            System.out.println("It's");
        }
        else{ System.out.println("It isn't"); }
    }
}
