import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTime {
    public static boolean isValidTime(String time) {

        String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

        Pattern p = Pattern.compile(regex);
        if (time == null) {
            return false;
        }
        Matcher m = p.matcher(time);

        return m.matches();
    }

}
