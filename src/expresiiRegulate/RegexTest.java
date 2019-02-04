package expresiiRegulate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        String regex = "(0[237]\\d{2})\\d{6}";
        String text = "Numarele mele sunt: 0741989987, 0345896245";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));

        }

        System.out.println(text.replaceAll(regex, "\\1*"));
    }
}
