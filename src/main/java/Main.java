import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String firstParse = "";
    static String getNameValue = "";
    static String getValues = "";
    static String keys = "";
    static List<String> values = new ArrayList<>();
    static String regEx = "";
    public String readRawDataToString() throws Exception{

        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();


        JerksonParser jerkParse = new JerksonParser();
        firstParse = jerkParse.getFirstParse(output);
        //values = jerkParse.getAllValues(firstParse, regEx);
        //keys = jerkParse.getAllKeys(firstParse, regEx);
        //getNameValue = jerkParse.getKey(firstParse, jerkParse.findName);
        //getValues = jerkParse.getValue(firstParse, jerkParse.findExpirationValue);
        values = jerkParse.getValue(firstParse, jerkParse.findPriceValue);
        System.out.println(getNameValue);
        System.out.println(getValues);
        System.out.println(values.toString());


    }


}
