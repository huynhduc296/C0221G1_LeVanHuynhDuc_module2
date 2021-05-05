package bai_18.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NumberExample="^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]$";
    public PhoneExample(){
        pattern=Pattern.compile(NumberExample);
    }
}
