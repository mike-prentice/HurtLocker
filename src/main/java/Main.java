import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String firstParse = "";
    static String getNameValue = "";
    static String keys = "";
    static String values = "";
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
        values = jerkParse.getAllValues(firstParse, regEx);
        keys = jerkParse.getAllKeys(firstParse, regEx);
        getNameValue = jerkParse.getValue(firstParse);
        System.out.println(keys);
        System.out.println(values);


    }


}
