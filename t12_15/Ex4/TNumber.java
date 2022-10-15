package t12_15.Ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TNumber
{
    StringBuilder phoneNumber;

    TNumber(String tnumber){
        if (tnumber.charAt(0) != '+'){
            tnumber = "+7" + tnumber.substring(1);
        }

        Pattern pattern = Pattern.compile("(\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$");
        Matcher matcher = pattern.matcher(tnumber);
        matcher.find();

        phoneNumber = new StringBuilder(matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3) + " " + matcher.group(4));
    }


}
