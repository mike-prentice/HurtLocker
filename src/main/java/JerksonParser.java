import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JerksonParser {
    //public String data;
    public String groceryList;
    public List<String> groceryList1 = new ArrayList<>();



    public String getGroceries(String input) {
        StringBuilder str = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-z][A-Z] && [:] && [;]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            str.append(matcher.group());
        }

        System.out.println(str);
        groceryList = str.toString();
        return String.valueOf(str);

    }
    public String removeSemis(String input){
        StringBuilder str = new StringBuilder();
        Pattern pattern2 = Pattern.compile(";");
        Matcher matcher2 = pattern2.matcher(groceryList);
        while (matcher2.find()) {
            matcher2.replaceAll(":");
            str.append(matcher2.group());
        }
        System.out.println(str);
        return String.valueOf(str);
    }
//    public String getKeysAndValues(List<String> input){
//        Pattern pattern = Pattern.compile("(name.*?[;|%|*|@|^]) || (price.*?[;|%|*|@|^]) || (type.*?[;|%|*|@|^]) || (expiration.*?[;|%|*|@|^])", Pattern.CASE_INSENSITIVE);
//            Matcher matcher = pattern.matcher(input.toString());
//            while (matcher.find()){
//                groceryList1.add(matcher.group());
//        }System.out.println(groceryList1);
//        return groceryList1;
//        }

    }
//