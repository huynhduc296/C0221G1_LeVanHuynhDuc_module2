package bai_18.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NameRegex= "^[CAP][0-9]{4}[GHIKLM]$";
    public NameExample() {
        pattern=Pattern.compile(NameRegex);
    }
    public boolean validate(String regex){
        matcher =pattern.matcher(regex);
        return matcher.matches();
    }
}
