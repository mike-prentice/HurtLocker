import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JerksonParser {
    String findName = "(?=name[:]).*?(?=[:])";
    String findPrice = "(?=price[:]).*?(?=[:])";
    String findType = "(?=type[:]).*?(?=[:])";
    String findExpiration = "(?=expiration[:]).*?(?=[:])";
    String findNameValue = "(?<=name[:]).*?(?=[;])";
    String findPriceValue = "(?<=price[:]).*?(?=[;])";
    String findTypeValue = "(?<=type[:]).*?(?=[;e])";
    String findExpirationValue = "(?<=expiration[:]).*?(?=n)";
    List<String> nameValue = new ArrayList<>();
    List<String> priceValue = new ArrayList<>();
    List<String> typeValue = new ArrayList<>();
    List<String> expirationValue = new ArrayList<>();
    List<Grocery> groceriesList = new ArrayList<>();







    public String getFirstParse(String input) {
        String firstParse = "";
        Pattern pattern = Pattern.compile("[a-zA-Z:;.0-9/]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            firstParse += matcher.group();
        }
        //System.out.println(firstParse);

        return firstParse;
    }

    public String getAllKeys(String input, String regEx){
        String keys = "";
        for (int i = 0; i <= 3; i++) {
            if(i == 0){
                getKey(input, findPrice);
            } else if (i == 1){
                getKey(input, findType);
            } else if (i == 2){
                getKey(input, findExpiration);
            } else if (i == 3) {
                getKey(input, findName);
            }
        }
        //System.out.println(keys);
        return keys;
    }

    public List<String> getAllValues(String input){
        List<String> values = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            if(i == 0){
              priceValue =  getValue(input, findPriceValue);
            } else if (i == 1){
               typeValue =  getValue(input, findTypeValue);
            } else if (i == 2){
                expirationValue = getValue(input, findExpirationValue);
            } else if (i == 3) {
               nameValue = getValue(input, findNameValue);
            }
        }
        //System.out.println(values);
        return values;
    }

        public String getKey(String input, String regEx) {
        String keys = "";
                Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    keys += matcher.group();
                }

            //System.out.println(keys);
            return keys;
        }

    public List<String> getValue(String input, String regEx) {
        List<String> values = new ArrayList<>();
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            values.add(matcher.group());
        }
        //System.out.println(values);
        return values;
    }
    public List<Grocery> buildGroceries(){
        for (int i = 0; i < expirationValue.size(); i++) {
            Grocery grocery = new Grocery(nameValue.get(i), priceValue.get(i), typeValue.get(i), expirationValue.get(i));
            groceriesList.add(grocery);
            System.out.println(grocery);
        }

        return groceriesList;
    }
    }
