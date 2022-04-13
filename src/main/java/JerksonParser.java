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
    String findTypeValue = "(?<=type[:]).*?(?=[;])";
    String findExpirationValue = "(?<=expiration[:]).*?(?=[;])";





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
        //System.out.println(output);
        return keys;
    }

    public String getAllValues(String input, String regEx){
        String values = "";
        for (int i = 0; i <= 3; i++) {
            if(i == 0){
                getKey(input, findPriceValue);
            } else if (i == 1){
                getKey(input, findTypeValue);
            } else if (i == 2){
                getKey(input, findExpirationValue);
            } else if (i == 3) {
                getKey(input, findNameValue);
            }
        }
        //System.out.println(output);
        return values;
    }

        public String getKey(String input, String regEx) {
        String keys = "";
                Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    keys += matcher.group();
                }

            System.out.println(keys);
            return keys;
        }

    public String getValue(String input) {
        String values = "";
        Pattern pattern = Pattern.compile("(?<=name[:]).*?(?=[;])", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            values += matcher.group();
        }
        System.out.println(values);
        return values;
    }
    }
