package lab9;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NumCounter {
    public int countNum(String s) {
        final String[] arr1 = s.split(" ");
        int res = 0;
        Pattern pattern = Pattern.compile("\\d+");
        for (String i:arr1){
            Matcher matcher = pattern.matcher(i);
            boolean found = matcher.matches();
            if(found)
                res++;
        }
        return res;
    }
}
