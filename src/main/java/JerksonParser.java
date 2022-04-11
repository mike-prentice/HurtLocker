import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JerksonParser {
    //public String data;
    public List<String> groceryList = new ArrayList<>();
    public List<String> groceryList1 = new ArrayList<>();



    public List<String> getGroceries(String input) {
        Pattern pattern = Pattern.compile("name.*?[#*$]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            groceryList.add(matcher.group());
        }
        System.out.println(groceryList);
        for (String s: groceryList
             ) {
            System.out.println(s);
        }
        return groceryList;

    }
    public List<String> getKeysAndValues(List<String> input){
        Pattern pattern = Pattern.compile("(.name.*?[;|,|.|:|@]) || (.price.*?[;|,|.|:|@]) || (.type.*?[;|,|.|:|@]) || (.expiration.*?[;|,|.|:|@])");
        for (String s: input) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()){
                groceryList1.add(matcher.group());
        }
        }
        System.out.println(groceryList1);
        return groceryList1;
    }
}