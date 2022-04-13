import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JerksonParser {

    public List<String> groceryList = new ArrayList<>();


    public List<String> getGroceries(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z:;.0-9/]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            groceryList.add(matcher.group());
        }
        for (String s: groceryList) {
            System.out.println(s);
        }
        return groceryList;
    }

        public List<String> getKeys(List<String> input) {
        List<String> newKeyArray = new ArrayList<>();
            Pattern pattern = Pattern.compile("(?=name[:]).*?(?=[:])");
            for (String string : input) {
                Matcher matcher = pattern.matcher(string);
                if (matcher.find()) {
                    System.out.println(string);
                    newKeyArray.add(string);
                }
        }
            return newKeyArray;
        }
    }
//(?<=name[:]).*?(?=[;])