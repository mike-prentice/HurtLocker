import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JerksonParser {

    public List<String> groceryList = new ArrayList<>();


    public String getFirstParse(String input) {
        String firstParse = "";
        Pattern pattern = Pattern.compile("[a-zA-Z:;.0-9/]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            firstParse += matcher.group();
        }
        System.out.println(firstParse);

        return firstParse;
    }

        public String getNameKey(String input) {
        String nameParse = "";
                Pattern pattern = Pattern.compile("(?=name[:]).*?(?=[:])", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    nameParse += matcher.group();
                }
            System.out.println(nameParse);
            return nameParse;
        }

    public String getNameValue(String input) {
        String nameValueParse = "";
        Pattern pattern = Pattern.compile("(?<=name[:]).*?(?=[;])", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            nameValueParse += matcher.group();
        }
        System.out.println(nameValueParse);
        return nameValueParse;
    }
    }
//(?<=name[:]).*?(?=[;])